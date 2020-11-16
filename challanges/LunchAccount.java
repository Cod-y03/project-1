import java.util.Random;

public class LunchAccount
{
    private String name;
    private int id = 0;
    private double balance = 0;
    private double spent = 0;
    private int lunchCount = 0;
    private int firstAddToBalance = 1;
    double burger = 3.99;
    double chips = 2.99; 
    double fries = 1.50; 
    Random randomGenerator = new Random();
    int numb = 0;

    
    public LunchAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
            this.id = makeID();
            numb = numb + 1;
            extra();
        }
        
        public LunchAccount(String name) {
            this.name = name;
            this.id = makeID();
            numb = numb + 1;
            extra();
        }
        
        public void extra() {//to check if they would get the extra money for adding to the account
           if (firstAddToBalance > 0) { 
                if (numb < 100) { 
                    this.balance = this.balance + 20;
                }
            }
            firstAddToBalance = 0;   
        }

        public int makeID() {
            int max = 99; 
            return (randomGenerator.nextInt(max) * 100) + numb; //uses the count of acounts to unsure that its unike.
        }

        public int getLunchCount() {
            return lunchCount;
        }

        public double getBalance() {
            return balance;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void addBalance(int add) {
            balance += add;
            extra();
        }

        public String buyLunch(int first, int second) {
            if ((this.balance - lunchTotal(first, second)) > 0 ) {
                this.balance = this.balance - lunchTotal(first, second);//lunch cost
                this.spent = this.spent + lunchTotal(first, second);
                this.lunchCount += 1;
                return "lunch purchaced, cost: " + lunchTotal(first, second);
            } else {
                return "not enough money";
            }
        }

        public double lunchTotal(int first, int second) {
            double sum = 0;
            if (first == 1) {
                sum += burger;
            }else if (first == 2) {
                sum += fries;
            }else if (first == 3) {
                sum += chips;
            }
            if (second == 1) {
                sum += burger;
            }else if (second == 2) {
                sum += fries;
            }else if (second == 3) {
                sum += chips;
            }
            return sum;
        }
}