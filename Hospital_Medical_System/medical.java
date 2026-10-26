package Hospital_Medical_System;

public abstract class medical {
    // service ID, service name, base cost, and an abstract method calculateTotalCost()
    int service_id;
    String service_name;
    double base_cost;

    medical(int service_id, String service_name, double base_cost){
        this.service_id = service_id;
        this.service_name = service_name;
        this.base_cost = base_cost;
    }

    abstract double calculate_total();

    void display(){
        System.out.println("service id: " + service_id);
        System.out.println("service name: " + service_name);
        System.out.println("total cost: " + calculate_total());
    }
}

class consaltation extends medical{

    double doctor_fee;

    consaltation(int service_id, String service_name, double base_cost, double doctor_fee){
        super(service_id, service_name, base_cost);
        this.doctor_fee = doctor_fee;
    }

    @Override
    double calculate_total() {
        return base_cost + doctor_fee;
    }


}

class laboratory extends medical{

    double test_charge;

    laboratory(int service_id, String service_name, double base_cost, double test_charge){
        super(service_id, service_name, base_cost);
        this.test_charge = test_charge;
    }

    @Override
    double calculate_total() {
        return base_cost + test_charge;
    }

}

class ultrasound extends medical{

    double additional_fee;

    ultrasound(int service_id, String service_name, double base_cost, double additional_fee){
        super(service_id, service_name, base_cost);
        this.additional_fee = additional_fee;
    }

    @Override
    double calculate_total() {
        return base_cost + additional_fee;
    }


}

class mainmedical {
    static void main() {
        medical [] m = {
                new consaltation(10, "consaltation test", 90, 100),
                new laboratory(11, "laboratory test", 120, 200),
                new ultrasound(12, "ultrasound", 200, 300)
        };

        for (medical mdl : m){
            mdl.display();
            System.out.println();
        }
    }
}

