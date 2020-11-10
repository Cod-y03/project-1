import java.util.Random;

public class Employee
{
    private String name = " ";
    private double wage = 0;
    private int id = 0;
    private double hours = 0;
    private double totalHours = 0;
    
    // public static int ids() {
    //      Random randomGenerator = new Random();
    //     int max = 999999;
    //     int personalID = 100000 + randomGenerator.nextInt(max);
    //    if () 
    // }

    //Contructers

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;

        
    }
    public Employee(String name, double wage, double totalHours) {
        this.name = name;
        this.wage = wage;
        this.totalHours = totalHours;
    }

    //abilitys

    public void addHours(int addedHour) {
        this.hours = this.hours + addedHour;
        this.totalHours = this.totalHours + addedHour;
    }

    public double requestPaycheck() {
        return this.wage * this.hours - (this.wage * this.hours * .15);

    }

}