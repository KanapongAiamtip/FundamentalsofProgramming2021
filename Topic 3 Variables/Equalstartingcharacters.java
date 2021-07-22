import java.util.Scanner;
public class Equalstartingcharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String y = in.nextLine();
        System.out.println(x.charAt(0)==y.charAt(0));
    }
}
