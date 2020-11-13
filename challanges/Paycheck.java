public class Paycheck
{
    private Employee payee;
    private double amount;
    private double savedHours;
    private double savedWage;

    public Paycheck(Employee payee) {
        this.payee = payee;
        this.amount = amount;
        this.savedHours = payee.getHours();
        this.savedWage = payee.getWage();
    }

    public double getPayment() {
        return this.savedWage * savedHours * (1.0 - .15);// 0.15 taxes
    }

    public boolean isEroneus() {
        return this.savedWage > 100 || getPayment() > 1500;
    }

    // public String toString() {
    //     return "Eroneus check";
    // }
}