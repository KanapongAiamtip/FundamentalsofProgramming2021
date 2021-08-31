import java.util.Scanner;
public class Temperatureconverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double result = fahrenheitToCelsius(sc.nextDouble());
        System.out.println(String.format("%.1f", result));
    }

    private static double fahrenheitToCelsius(double win_ny2)
    {
        double sum = (win_ny2-32.0)*5.0 / 9.0;
        return sum;
    }

}
