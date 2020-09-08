public class part_2
{
    public static void main(String[] args )
    {
        double x = 0.5236;
        double sinx = Math.sin(x);
        double cosx = Math.cos(x);
        double sum = (cosx * cosx) + (sinx * sinx);

        System.out.println("sine: \t" + sinx + "\ncosine: \t" + cosx + "\nsum of squares: \t" + sum);
    }
}