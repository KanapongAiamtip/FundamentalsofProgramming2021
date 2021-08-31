import java.util.Scanner;
public class Propercase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String result = properCase(sc.nextLine());
        System.out.println(result);
    }

    private static String properCase(String jjaajaaaa) 
    {   String ft ="";
        String x = "";
        for (int i = 0; i < jjaajaaaa.length(); i++)
        {
            if(i==0)
            {
                ft+=jjaajaaaa.charAt(0);
            }
            else
            {
                x+=jjaajaaaa.charAt(i);
            }
        }
        return ft.toUpperCase()+x.toLowerCase();
    }
}
