import java.util.*;
class Employee{
    private int salary, id;
    public Employee()
    {
        salary = 15000;
        id = 001;
    }
    public Employee(int salary)
    {
        this.salary = salary;
        id = 002;
    }
    public Employee(int id, int salary)
    {
        this.id = id;
        this.salary = salary;
    }
    void display(){
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(25000);
        Employee e3 = new Employee(005, 60000);

        e1.display();
        e2.display();
        e3.display();
    }
}