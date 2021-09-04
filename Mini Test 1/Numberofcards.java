import java.util.Scanner;
public class Numberofcards 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        System.out.println(input.length);
    }
}
