import java.util.*;
public class Nothalfodd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x/2;
        for (int i = 1 ; i <= y ; i++)
        {
            System.out.println(i*2);
        }
    }
}