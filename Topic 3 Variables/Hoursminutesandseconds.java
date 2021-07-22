import java.util.Scanner;

public class Hoursminutesandseconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double hours = x * 24;
        double minutes = x * 60 * 24;
        double seconds = x * 60 * 60 * 24;
        System.out.println(String.format("%.0f", hours) + " hours" + "\nor\n" + String.format("%.0f", minutes)+ " minutes\nor\n" + String.format("%.0f", seconds) + " seconds");
    }
}