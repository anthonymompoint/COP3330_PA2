import java.util.Scanner;

public class poll {
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		String[] topics = new String[5];
		int[][] votes = new int[5][10];
		double[] avgs = new double[5];
		int longTop = 0;
		for(int i = 0; i < 5; i ++)
		{
			System.out.println("Please enter a topic: ");
			topics[i] = scnr.nextLine();
			if(topics[i].length() > longTop)
				longTop = topics[i].length();
		}
		
		while(true)
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Please rate "+ topics[i] + " from 1(least important) to 10(most important): ");
				votes[i][scnr.nextInt() - 1]++;
			}
			System.out.println("If another user would like to rate the topics enter 1, otherwise enter 0: ");
			if(scnr.nextInt() == 0)
				break;
		}
		
		int highTop = 0;
		int highestTot = 0;
		int lowTop = 0;
		int lowestTot = 1000;
		
		for(int i = 0; i < 5 ;i++)
		{
			int tot = 0;
			double numvot = 0;
			for(int j = 0; j < 10; j++ )
			{
				tot += votes[i][j] * (j + 1);
				numvot += votes[i][j];
			}
			
			avgs[i] = tot/numvot;
			
			if(highestTot < tot)
			{
				highestTot = tot;
				highTop = i;
			}
			if(lowestTot > tot)
			{
				lowestTot = tot;
				lowTop = i;
			}
			
		}
		
		int highNumLen = (String.valueOf(highestTot).length() > 2) ? String.valueOf(highestTot).length() : 2;
		
		for(int i = -1; i < 5; i++)
		{
			System.out.print("|");
			if(i < 0)
			{
				for(int x = 0; x < longTop; x++)
				{
					System.out.print(" ");
				}
				System.out.print("|");
				for(int j = 0; j < 10; j++)
				{
					System.out.print(j + 1);
					for(int k = 0; k < highNumLen - String.valueOf(j + 1).length(); k++)
						System.out.print(" ");
					System.out.print("|");
				}
				
				System.out.println("Avg");
			}
			else
			{
				System.out.print(topics[i]);
				for(int x = 0; x < longTop - topics[i].length(); x++)
				{
					System.out.print(" ");
				}
				System.out.print("|");
				for(int j = 0; j < 10; j++)
				{
					System.out.print(votes[i][j]);
					for(int y = 0; y < highNumLen - String.valueOf(votes[i][j]).length(); y++)
					{
						System.out.print(" ");
					}
					System.out.print("|");						
				}
				System.out.printf("%.2f\n", avgs[i]);
			}
		}
		
		System.out.println("The highest point total was " + topics[highTop] + " with " + highestTot + " points.");
		System.out.println("The lowest point total was " + topics[lowTop] + " with " + lowestTot + " points.");
		
	}
}
