import java.util.Scanner;

public class Similarstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        String text1 = input1.toLowerCase();
        String text2 = input2.toLowerCase();
        if (input1.equals(input2)) {
            System.out.println("exact match");
        } 
        else if (text1.contains(text2)) {
            System.out.println("similar");
        } 
        else {
            System.out.println("not the same");
        }
    }
}
