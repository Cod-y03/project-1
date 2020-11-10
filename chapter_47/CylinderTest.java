public class CylinderTest
{
    public static void main(String[] args) {
        Cylinder cylinderA = new Cylinder(10, 4);
        System.out.println("Volume: " + cylinderA.volume());
        System.out.println("Surface Area: " + cylinderA.surfaceArea());
    }
}