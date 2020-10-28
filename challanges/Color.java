import java.util.Random;
import java.util.Scanner;


public class Color 
{
    Random randomNumber = new Random();
    int max = 255;
    private int red;
    private int green;
    private int blue;

    //constructers
    public Color() {
        this.red = randomNumber.nextInt(max);
        this.green = randomNumber.nextInt(max);
        this.blue = randomNumber.nextInt(max);
        }
    public Color( int red, int green, int blue)
    {
        this.red = red;
        if (red > 255) {
            this.red = 255;
        }
        if (red < 0) {
            this.red = 0;
        }
        this.green = green;
        if (green > 255) {
            this.green = 255;
        }
        if (green < 0) {
            this.green = 0;
        }
        this.blue = blue;
        if (blue > 255) {
            this.blue = 255;
        }
        if (blue < 0) {
            this.blue = 0;
        }
    }

    //setters and getters


}
