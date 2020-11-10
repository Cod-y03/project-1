public class Cylinder 
{
    private double hieght;
    private double radius;

    public Cylinder(double hieght, double radius) {
        this.hieght = hieght;
        this.radius = radius;

    }
    public double volume() {
        return Math.PI * (radius * radius) * hieght;
    }
    public double surfaceArea() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * hieght);
    }
}