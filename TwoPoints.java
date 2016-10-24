import java.util.Scanner;

public class TwoPoints {
    private static double x;
    private static double distance;

   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first two points (x1,y1) :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter second two points (x2,y2) :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        x = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));


        distance = Math.sqrt(x);
        System.out.print("The distance of the two points is \n" + distance);
    }
}