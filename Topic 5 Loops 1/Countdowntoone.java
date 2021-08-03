import java.util.Scanner;
public class Countdowntoone
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = x ; i >= 0 ; i--)
        {
            if (i > 3 )
            {
                System.out.println(i);
            }
            else if(i==3)
            {
                System.out.println("THREE");
            }
            else if(i==2){
              System.out.println("TWO");
            }
            else if(i==1){
              System.out.println("ONE");
            }
        }

    }
}