public class ColorTest
{
    public static void main(String[] args) {

        Color color = new Color(288, 12, 120);
        System.out.println("first" + color.getColor());
        Color color2 = new Color();
        System.out.println("second" + color2.getColor());

        color2.setRandom();
        System.out.println("2 random" + color2.getColor());

        color2.setRed(134);
        System.out.println("2 red" + color2.getColor());

        color.lighten(10);
        System.out.println("1 lightened" + color.getColor());
        
        color.darken(50);
        System.out.println("1 darkened" + color.getColor());
    }

}