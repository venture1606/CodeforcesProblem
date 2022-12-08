import java.util.Scanner;

public class Watermelon
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        if (weight == 2 || weight % 2 == 1)
        {
            System.out.print("NO");
        }
        else
        {
            System.out.print("YES");
        }
    }
}