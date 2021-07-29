import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       double x = in.nextDouble();
       double hr = x*24;
       double min = x*24*60;
       double sec = x*24*60*60;
       System.out.println(String.format("%.0f",hr)+" hours");
       System.out.println("or");
       System.out.println(String.format("%.0f",min)+" minutes");
       System.out.println("or");
       System.out.println(String.format("%.0f",sec)+" seconds");

    }
}
