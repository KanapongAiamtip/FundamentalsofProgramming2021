import java.util.Scanner;
public class Averagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = 0;
        double sum = 0;
        while(true)
        {
            int Leon = sc.nextInt();
            if(Leon==-1){
                break;
            }
            c++;
            sum+=Leon;
        }
        double arr = sum/c;
        System.out.println(String.format("%.1f",arr));
    }
}
