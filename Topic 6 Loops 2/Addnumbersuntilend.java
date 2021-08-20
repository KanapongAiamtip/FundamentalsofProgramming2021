import java.util.Scanner;

public class Addnumbersuntilend {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int x;
        do{
         x = sc.nextInt();
         sum+=x;
        } 
        while (x != 0);
        System.out.println(sum);
    }
    
}
