import java.util.Scanner;
public class Doubleformat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String result1 = doubleFormat(sc.nextDouble());
        String result2 = doubleFormat(sc.nextDouble());
        System.out.println(result1 + " " + result2);
    }

    public static String doubleFormat(double bbenzalert) 
    {     
        return String.format("%.2f",bbenzalert); 
    }
}