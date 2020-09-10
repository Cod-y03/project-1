
public class payroll_program
{
    public static void main (String[] args )
    {
        long hoursWorked = 30;
        double payRate = 12.0, taxRate = 0.10;
        System.out.println("Hours worked: " + hoursWorked );
        System.out.println("pay Amount :" + (hoursWorked * payRate) );
        System.out.println("tax Amount :" + (hoursWorked * payRate * taxRate) );
    }
}