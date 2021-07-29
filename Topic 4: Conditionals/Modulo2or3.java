import java.util.Scanner;
 public class Modulo2or3 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x = in.nextInt();
         if(x%2==0 && x%3==0){
            System.out.println(23);
         }
         else if(x%2==0){
            System.out.println(2);
         }
         else if(x%3==0){
            System.out.println(3);
         }
         else{
            System.out.println("-");
         }
     }
 }