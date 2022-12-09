import java.util.Scanner;

public class WaysTooLongWords
{
    public static void main(String[] args)
    {
	Scanner s = new Scanner(System.in);
      int length = s.nextInt();
      String words[] = new String[length];
      for (int x = 0; x < length; x++)
      {
		words[x] = s.next();
      }
      for (String y : words)
      {
      	if (y.length() > 10)
            {
            	System.out.print(y.charAt(0));
            	System.out.print(y.length()-2);
                	System.out.println(y.charAt(y.length()-1));
            }
            else
            {
                	System.out.println(y);
            }
       }
	}
}