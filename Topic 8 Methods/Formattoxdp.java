import java.util.Scanner;
public class Formattoxdp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String result = decimalFormat(sc.nextDouble(), sc.nextInt());
        System.out.println(result);
    }

    private static String decimalFormat(double x , int y)
    {
        return String.format("%."+y+"f",x);
    }

}