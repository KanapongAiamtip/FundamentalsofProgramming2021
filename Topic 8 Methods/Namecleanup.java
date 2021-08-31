import java.util.Scanner;

public class Namecleanup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = cleanName(sc.nextLine());
        System.out.println(result);
    }

    private static String cleanName(String csnp_21) 
    {
        String value = csnp_21.toLowerCase();
        String remove = value.replace("mrs", "");
        String removeA = remove.replace("mr", "");
        String removeB = removeA.replace("miss", "");
        String removeC = removeB.replace("ms", "");
        String removeD = removeC.replace(".", "");
        String removeE = removeD.trim();
        String result[] = removeE.split("");
        String a = "";
        for (int i = 0; i < result.length; i++) 
        {
            if (i == 0) 
            {
                a += result[i].toUpperCase();
            } 
            else 
            {
                a += result[i];
            }
        }
        return a;
    }
}
