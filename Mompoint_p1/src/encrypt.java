import java.util.Scanner;

public class encrypt 
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		int delim = 4;
		while(delim != -1)
		{
			System.out.print("Enter a number for encrpytion, or type enter -1 to exit. ");
			delim = scnr.nextInt();
			if(delim != -1)
				encrypt(delim);
		}
		return;
	}
	
	static void encrypt(int input)
	{
		
		// Separates individual digits of input value
		int digit1 = input / 1000;
		int digit2 = (input / 100) % 10;
		int digit3 = (input / 10) % 10;
		int digit4 = input % 10;
		
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;
		
		System.out.println(digit3 + "" + digit4 + "" + digit1 + "" + digit2);
	}
}
