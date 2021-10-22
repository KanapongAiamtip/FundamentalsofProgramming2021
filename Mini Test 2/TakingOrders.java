import java.util.Scanner;
import java.util.ArrayList;
public class TakingOrders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> dessert = new ArrayList<String>();
        int stop=0;
        while(true)
        {
            String p = in.nextLine().toLowerCase();
            dessert.add(p);
            stop++;
            if(stop==10)
            {
                break;
            }      
        }
        int total =0;
        for (int i = 0; i < dessert.size(); i++) {
            if (dessert.get(i).equals("croissant")) {
                total += 10;
            }
            else if(dessert.get(i).equals("scone"))
            {
                total += 25;
            }
        }
        System.out.println(total+" minutes");
    }
}
