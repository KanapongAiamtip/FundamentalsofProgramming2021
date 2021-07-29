import java.util.Scanner;
 public class Bigorsmall {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x = in.nextInt();
         if (x>=100) {
            System.out.println("big");
         }
         else{
            System.out.println("small");
         }
     }
 }