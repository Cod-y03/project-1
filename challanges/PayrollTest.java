public class PayrollTest
{
    public static void main(String[] args) {
        Employee samEvens = new Employee("Sam Evans", 12.50);
        samEvens.addHours(10);
        
        System.out.println(samEvens.requestPaycheck());
        
        System.out.println(" a");
    }
}