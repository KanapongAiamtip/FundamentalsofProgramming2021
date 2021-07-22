import java.util.Scanner;
public class Truetoseven{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x==7) {
            System.out.println(true);
        } 
        else {
            System.out.println(false); 
        }
    }
}