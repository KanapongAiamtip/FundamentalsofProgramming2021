import java.util.Scanner;
public class Valueaddedtax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        double vat = (0.07 * price);
        double sum = (price + vat);
        System.out.println(String.format("%.2f", price) + " baht + VAT = " + String.format("%.2f", sum) + " baht");
    }
}