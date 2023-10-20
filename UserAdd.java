//1) accept two numbers and add them.
sol:-
import java.util.Scanner;
import static java.lang.System.out;
public class Main
{
	public static void main(String args[])
	{
		int num1 = new Scanner(System.in).nextInt();
		int num2 = new Scanner(System.in).nextInt();
		out.println("Additon of "+num1 +" + "+" num2 : "+(num1+num2));
	}
}