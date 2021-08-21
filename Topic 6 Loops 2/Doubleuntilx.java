import java.util.Scanner;
public class Doubleuntilx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Leon = sc.nextInt();
        for (int i = 0; i <=Leon; i++) {
            if(Math.pow(2,i)<=Leon){
                System.out.println((int)(Math.pow(2,i)));
            } 
        }
        
    }
}
