import java.util.Scanner;
public class Ingredients {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String put = in.nextLine().toLowerCase();
        if (put.equals("apple")) 
        {
            System.out.println("ok");
        }
        else if(put.equals("banana"))
        {
            System.out.println("ok");
        }
        else if(put.equals("cherry"))
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("not found");
        }
    }
}
