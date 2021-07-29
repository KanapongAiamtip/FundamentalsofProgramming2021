import java.util.Scanner;
public class Q8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        double sum = a.length()+b.length()+c.length();
        double arr = sum/3;
        System.out.println(String.format("%.2f",arr));
    }
}
