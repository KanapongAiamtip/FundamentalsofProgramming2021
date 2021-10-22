import java.util.Scanner;

public class CakeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i <= input;) {
            String inputst = sc.next();
            int sum = 0;
            if (inputst.equals("-")) {

                if (i != 0)
                    System.out.println("= " + sum2 + " baht\n");
                sum2 = 0;
                if (i != input)
                    System.out.println("Order " + (i + 1));
                if (i != input)
                    System.out.println("-------");
                i++;
            }

            else {
                String checkst = Character.toString(inputst.charAt(0));
                int check = Integer.parseInt(checkst);
                if (inputst.charAt(1) == 'E') {
                    System.out.println(check + "x Eclair");
                    sum += check * 80;
                } else if (inputst.charAt(1) == 'C') {
                    System.out.println(check + "x Chelsea Bun");
                    sum += check * 60;
                } else if (inputst.charAt(1) == 'S') {
                    System.out.println(check + "x Scone");
                    sum += check * 40;
                } else if (inputst.charAt(1) == 'B') {
                    System.out.println(check + "x Brownie");
                    sum += check * 55;
                }
                sum2 += sum;
            }
            sum3 += sum;
        }
        System.out.println("Total");
        System.out.println("= " + sum3 + " baht");
    }
}
