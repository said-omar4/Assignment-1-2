package Employee_Salary_Sytem;

// Employee Salary Management System

public class Employee {

    // employee ID, name, department, basic salary, and a calculateSalary() method
    int employee_id;
    String name;
    String department;
    String category;
    double basic_salary;

    Employee(int employee_id,String name, String department,String category, double basic_salary){
        this.employee_id = employee_id;
        this.name = name;
        this.department = department;
        this.category = category;
        this.basic_salary = basic_salary;
    }

    double calculate_salary(){
        return basic_salary;
    }

    void display(){
        System.out.println("Employee id: " + employee_id);
        System.out.println("Employee department: " + department);
        System.out.println("Employee category: " + category);
        System.out.println("Basic Salary: " + calculate_salary());
    }

}

class FullTimeEmployee extends Employee{
    double allowance;

    FullTimeEmployee(int employee_id,String name, String department,String category, double basic_salary, double allowance){
        super(employee_id, name, department, category, basic_salary);
        this.allowance = allowance;
    }

    @Override
    double calculate_salary() {
        return basic_salary + allowance;
    }
}

class PartTimeEmployee extends Employee{
    double hours_worked;
    double hourse_rate;

    PartTimeEmployee(int employee_id,String name, String department,String category, double basic_salary, double hours_worked, double hourse_rate){
        super(employee_id, name, department, category, basic_salary);
        this.hours_worked = hours_worked;
        this.hourse_rate = hourse_rate;
    }

    @Override
    double calculate_salary() {
        return hours_worked * hourse_rate;
    }

}

class Manager extends Employee{
    double bonus;
    Manager(int employee_id,String name, String department,String category, double basic_salary, double bonus){
        super(employee_id, name, department, category, basic_salary);
        this.bonus = bonus;
    }

    @Override
    double calculate_salary() {
        return basic_salary * bonus;
    }

}

class mainsEmployees{
    static void main() {
        Employee[] e = {
                new FullTimeEmployee(1, "Said-omar", "Computer application", "Full-time Employee", 100, 1000),
                new PartTimeEmployee(2, "abdalla cali", "Networking", "Part-time Employee", 200, 20, 30),
                new Manager(3, "Maxamed baashi", "Multimedia", "Manager", 300, 3000)
        };

        // for each loop
        // stf waa variable aan rabo inaan ku shubo xogta lasoo aqriyey
        for (Employee emp: e){
            emp.display();
            System.out.println();
        }

    }
}