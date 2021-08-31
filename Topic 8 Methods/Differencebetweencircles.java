import java.util.Scanner;
public class Differencebetweencircles 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = circleAreaDifference(sc.nextDouble(), sc.nextDouble());
        System.out.println(String.format("%.3f", result));
    }

    public static double circleAreaDifference(double radius1, double radius2) 
    {
        double a = Math.PI* Math.pow(radius1,2);
        double b = Math.PI* Math.pow(radius2,2);
        double dif = Math.abs(a-b);
        return dif; 
    }
}
