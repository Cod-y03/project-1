import java.util.Random;


public class Employee
{
    private String name = " ";
    private double wage = 0;
    private int id = 0;
    private double hours = 0;
    private double totalHours = 0;

    private static int employeeCount = 0;
    
    //Contructers

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
        employeeCount ++;
        this.id = employeeCount;

        
    }

    public double getHours() {
        return this.hours;
    }
    public double getTotalHours() {
        return this.totalHours;
    }
    public int getID() {
        return this.id;
    }

    public double getWage() {
        return this.wage;
    }

    public String getName() {
        return this.name;
    }

    public void addHours(int addedHour) {
        this.hours = this.hours + addedHour;
        this.totalHours = this.totalHours + addedHour;
    }

    //abilitys
    public String toString() {
        return this.name + " worked " + this.hours + " this week at a wage of " + this.wage + "and eraned ";
    }

    public Paycheck requestPaycheck() {
        Paycheck paycheck = new Paycheck(this);
        this.hours = 0;
        return paycheck;
    }

}