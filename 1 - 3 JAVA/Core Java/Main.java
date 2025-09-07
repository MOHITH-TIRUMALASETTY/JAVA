class Employee{
    public String name;
    public int employeeId;
    protected double monthlySalary;

    Employee(){

    }

    Employee(String name, int employeeId, double monthlySalary){
        this.name = name;
        this. employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public double calculateAnualSalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
        return monthlySalary * 12;
    }

}

class Manager extends Employee{
    private double anualBonus;

    Manager(){

    }
    Manager(String name, int employeeId, double monthlySalary, double anualBonus){
        super(name,employeeId,monthlySalary);
        this.anualBonus = anualBonus;
        
    }

    public double calculateAnualSalary(){
        super.calculateAnualSalary(monthlySalary);
        this.anualBonus = anualBonus;
        return anualBonus + monthlySalary;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        double sal = obj1.calculateAnualSalary(1000.00);
        Manager obj2 = new Manager();
        double sal1 = obj2.calculateAnualSalary(100);

        System.out.println(sal + " "+ sal1);
    }
}
