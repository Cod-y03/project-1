import java.lang.Math;

public class Cone
{
    private double radius;
    private double hieght;

    public Cone(double hieght, double radius) {

        this.radius = radius;
        this.hieght = hieght;
    }

    public double slantHieght() {
        return Math.sqrt((radius * radius) + (hieght * hieght));
    }
    public double angle() {
        return (180 * Math.atan(radius / hieght) / Math.PI);
    }

}