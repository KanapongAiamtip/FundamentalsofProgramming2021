import java.util.Scanner;
 public class Customrepeater {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String x = in.nextLine();
         if (x.length()<8){
            System.out.println(x+" "+x+" "+x);
         }
         else{
            System.out.println(x+" "+x)
         }

     }
 }