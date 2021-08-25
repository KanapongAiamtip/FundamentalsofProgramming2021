import java.util.Scanner;
public class BigO {
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        int Leon = in.nextInt();
        for (int i = 0; i < Leon; i++) 
		{ 
			for (int j = 0; j < Leon; j++) 
            {
				if (i == 0 || i == (Leon - 1)) 
                {
					System.out.print("*");
				} 
                else 
                {
					if (j == 0 || j == (Leon - 1)) 
                    {
						System.out.print("*");
					} 
                    else 
                    {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
    }
}
