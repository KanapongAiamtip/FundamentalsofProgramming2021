import java.util.Scanner;
public class Cardvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char[] num = new char[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case 'A':
                    sum += 11;
                    break;
                case '2':
                    sum += 2;
                    break;
                case '3':
                    sum += 3;
                    break;
                case '4':
                    sum += 4;
                    break;
                case '5':
                    sum += 5;
                    break;
                case '6':
                    sum += 6;
                    break;
                case '7':
                    sum += 7;
                    break;
                case '8':
                    sum += 8;
                    break;
                case '9':
                    sum += 9;
                    break;
                case 'T':
                    sum += 10;
                    break;
                case 'J':
                    sum += 10;
                    break;
                case 'Q':
                    sum += 10;
                    break;
                case 'K':
                    sum += 10;
                    break;
            }
        }
        System.out.print(sum);
    }
}
