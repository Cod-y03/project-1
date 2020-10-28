public class ColorTest
{
    public static void main(String[] args) {

        Color color = new Color(23, 12, 120);
        color.getColor();
        Color color2 = new Color();
        color2.getColor();
        
        color2.setRandom();
        color2.getColor();
    }

}