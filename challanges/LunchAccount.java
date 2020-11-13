import sun.net.www.content.text.plain;

import java.util.Random;

import org.graalvm.compiler.nodes.debug.BlackholeNode;

public class LunchAccount
{
    private String name;
    private int id = 0;
    private double balance = 0;
    private double spent = 0;
    int numb = 0;


        public LunchAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
            numb = numb + 1;
            if (numb < 100) {
                this.balance = this.balance + 20;
            }
        }

        public LunchAccount(String name) {
            this.name = name;
            numb = numb + 1;
            if (numb < 100) {
                this.balance = this.balance + 20;
            }
        }

        public String buyLunch() {
            if ((this.balance - 5) > 0 ) {
                this.balance = this.balance - 5;//lunch cost
                this.spent = this.spent + 5;
                return "lunch purchaced, cost: $5";
            } else {
                return "not enough money";
            }
        }

}