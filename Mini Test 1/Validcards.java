import java.util.Scanner;
public class Validcards {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("");
        boolean first = false;
        boolean last = false;
        switch (input[0]) 
        {
            case "A":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "T":
            case "J":
            case "Q":
            case "K":
                first = true;
                break;
        }
        switch (input[1]) 
        {
            case "C":
            case "D":
            case "H":
            case "S":
                last = true;
                break;
        }
        if (first == true && last == true) 
        {
            System.out.print("valid");
        } 
        else 
        {
            System.out.print("invalid");
        }
    }
}
