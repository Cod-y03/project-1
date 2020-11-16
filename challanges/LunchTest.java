public class LunchTest
{
    public static void main(String[] args) {
         LunchAccount sam = new LunchAccount("Sam");
         LunchAccount gabe = new LunchAccount("Gabe", 5 ); 
         LunchAccount adam = new LunchAccount("Adam", 5); 

        sam.addBalance(10);
        System.out.println(sam.buyLunch(1, 2));//numbers to distingush items, 1 = burger, 2 = fries, 3 = chips


        System.out.println("gabe " + gabe.getBalance());
        System.out.println(gabe.buyLunch(1, 3));
        System.out.println(gabe.getBalance());
        System.out.println(gabe.buyLunch(1, 1));
        System.out.println(gabe.getBalance());
        System.out.println(gabe.buyLunch(1, 3));
        System.out.println(gabe.getBalance());
        System.out.println(gabe.buyLunch(2, 3));
        System.out.println(gabe.getBalance());

        adam.addBalance(10);
        System.out.println("adam " + adam.getBalance());
        System.out.println(adam.buyLunch(1, 3));
        System.out.println(adam.getBalance());
        adam.addBalance(10);
        System.out.println(adam.getBalance());
        System.out.println(adam.buyLunch(1, 2));

    }
}