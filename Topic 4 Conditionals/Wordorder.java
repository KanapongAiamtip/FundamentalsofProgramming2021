import java.util.Scanner;
public class Wordorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        if (a.length() < b.length() && a.length() < c.length()) {
            if (b.length() < c.length()) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            if (c.length() < b.length()) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        }

        if (b.length() < a.length() && b.length() < c.length()) {
            if (a.length() < c.length()) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
            if (c.length() < a.length()) {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        }

        if (c.length() < a.length() && c.length() < b.length()) {
            if (a.length() < b.length()) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
            if (b.length() < a.length()) {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
