import java.util.Scanner;

public class decrypt {
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		int delim = 4;
		while(delim != -1)
		{
			System.out.print("Enter a number for decryption, or type enter -1 to exit. ");
			delim = scnr.nextInt();
			if(delim != -1)
				decrypt(delim);
		}
		return;
	}
	
	static void decrypt(int input)
	{
		
		int digit1 = input / 1000;
		int digit2 = (input / 100) % 10;
		int digit3 = (input / 10) % 10;
		int digit4 = input % 10;
		
		digit1 = ((digit1 + 10) - 7) % 10;
		digit2 = ((digit2 + 10) - 7) % 10;
		digit3 = ((digit3 + 10) - 7) % 10;
		digit4 = ((digit4 + 10) - 7) % 10;
		
		System.out.println(digit3 + "" + digit4 + "" + digit1 + "" + digit2);
	}
}
