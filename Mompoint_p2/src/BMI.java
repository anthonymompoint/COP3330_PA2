import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args)
	{
		int index = -1;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter 1 for metric units enter 2 for imperial units");
		int input = scnr.nextInt();
		if (input == 1)
			index = BMIMetric();
		else if(input == 2)
			index = BMIImp();
		
		if(index == 1)
			System.out.println("BMI category: underweight");
		else if(index == 2)
			System.out.println("BMI category: normal weight");
		else if(index == 3)
			System.out.println("BMI category: overweight");
		else
			System.out.println("BMI category: Obese");
	}
	
	static int BMIMetric()
	{
		int index = -1;
		Double BMI;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter weight in kilograms: ");
		Double weight = scnr.nextDouble();
		System.out.println("Please enter height in meters: ");
		Double height = scnr.nextDouble();
		
		BMI = weight / (height * height);
		
		if (BMI  < 18.5)
			index = 1;
		else if (BMI < 25)
			index = 2;
		else if(BMI < 30)
			index = 3;
		else if(BMI >= 30)
			index  = 4;
		System.out.println("BMI: " + BMI);
		return index;
	}
	
	static int BMIImp()
	{
		int index = -1;
		Double BMI;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter weight in pounds: ");
		double weight = scnr.nextDouble();
		System.out.println("Please enter height in inches: ");
		double height = scnr.nextDouble();
		
		BMI = 703 * weight / (height * height);
		
		if (BMI  < 18.5)
			index = 1;
		else if (BMI < 25)
			index = 2;
		else if(BMI < 30)
			index = 3;
		else if(BMI >= 30)
			index  = 4;
		System.out.println("BMI: " + BMI);		
		return index;
	}
}
