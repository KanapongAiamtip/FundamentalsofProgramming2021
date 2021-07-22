import java.util.Scanner;
public class Totalstringlength{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String in1 = scanner.nextLine();
        String in2 = scanner.nextLine();
        System.out.println(in1.length());
        System.out.println(in2.length());
        System.out.println(in1.length()+in2.length());

    }
}