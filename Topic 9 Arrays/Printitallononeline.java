import java.util.Scanner;
public class Printitallononeline 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        String line="";
        while (true) 
        {
            line += " "+ in.nextLine();
            if (line.contains("*"))
            {
                break;
            }
        }
        String[] pond=line.split(" ");
        for (int i=0 ;  i<pond.length-1 ;i++)
        {
            System.out.print(pond[i]+" ");
        }
    }  
}

