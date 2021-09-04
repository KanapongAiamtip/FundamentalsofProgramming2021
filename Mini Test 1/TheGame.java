import java.util.Scanner;
public class TheGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String game = "";
        int stop = 0;
        while (true) 
        {
            String no = sc.next();
            game += no.charAt(0);
            if (no.equals("-")) 
            {
                stop++;
            }
            if (stop == 2) 
            {
                break;
            }
        }
        String[] player = game.split("-");
        String player1 = player[0];
        String player2 = player[1];
        boolean first = false;
        int point1 = 0;
        for (int i = 0; i < player1.length(); i++) 
        {
            switch (player1.charAt(0)) 
            {
                case 'A':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'T':
                case 'J':
                case 'Q':
                case 'K':
                    first = true;
                    break;
                default:
                    first = false;
                    break;
            }
            if (first == true) 
            {
                point1++;
            }
        }
        int point2 = 0;
        for (int i = 0; i < player2.length(); i++) 
        {
            switch (player2.charAt(0)) 
            {
                case 'A':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'T':
                case 'J':
                case 'Q':
                case 'K':
                    first = true;
                    break;
                default:
                    first = false;
                    break;
            }
            if (first == true) 
            {
                point2++;
            }
        }
        if (point1 < point2) 
        {
            System.out.print(1);
        } 
        else 
        {
            System.out.print(2);
        }
    }
}
