public class Addanarrayofints 
{
    public static void main(String[] args) 
    {
        int[] numbers = {2, 6, 5, 5, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) 
        {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
