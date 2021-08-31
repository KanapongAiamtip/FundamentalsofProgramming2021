import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int result = factorial(sc.nextInt());
        System.out.println(result);
    }

    private static int factorial(int Leon)
    {
        int sum = 1;
        for (int i = 1; i <=Leon; i++) 
        {
            sum=sum*i;
        }
        return sum;
    }
}
