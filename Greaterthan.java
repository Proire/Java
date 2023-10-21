import java.util.Scanner;
import static java.lang.System.out;
public class Main
{
	public static void main(String args[])
	{
		int num1 = new Scanner(System.in).nextInt();
		int num2 = new Scanner(System.in).nextInt();
		if(num1>num2)
			out.println("num1 is greater than num2");
		else if(num2>num1)
			out.println("num2 is greater than num1");
		else
			out.println("num1 is equal to num2");
	}
}