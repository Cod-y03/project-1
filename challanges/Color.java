import java.util.Random;


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

        this.blue = blue;

        this.green = green;
        checkColor();
    }


    //setters and getters
    public void setRed(int red) {
        this.red = red;
        checkColor();
    } 
    public void setBlue(int blue) {
        this.blue = blue;
        checkColor();
    } 
    public void setGreen(int green) {
        this.green = green;
        checkColor();
    } 

    public String getColor() {
        String rgb = "Color: " + this.red + ", " + this.green + ", " + this.blue;
        return rgb;
    }

    public void setRandom() {
        this.red = randomNumber.nextInt(max);
        this.green = randomNumber.nextInt(max);
        this.blue = randomNumber.nextInt(max);
    }

    //abilities
    public void checkColor() {
        if (this.red > 255) {
            this.red = 255;
        }
        if (this.red < 0) {
            this.red = 0;
        }
        if (this.green > 255) {
            this.green = 255;
        }
        if (this.green < 0) {
            this.green = 0;
        }
        if (this.blue > 255) {
            this.blue = 255;
        }
        if (this.blue < 0) {
            this.blue = 0;
        }
    }

    public void lighten(int percent) {
        int raise = ((255 * percent) / 100);

        this.red = this.red + raise;
        this.green = this.green + raise;
       
        this.blue = this.blue + raise;
        
        checkColor();
    }

    public void darken(int percent) {
        int  lower = ((255 * percent) / 100);
        System.out.println(lower);
        this.red = this.red - lower;
      
        this.green = this.green - lower;
      
       
        this.blue = this.blue - lower;
       
        checkColor();
    }
}
