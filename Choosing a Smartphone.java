import java.util.Scanner;

public class Main {
	public Scanner input = new Scanner(System.in);
	
	public int calcTotalMemory()
	{
		int apps, totalMemory = 0;
		
		apps = input.nextInt();
		input.nextLine();
		
		for(int j = 0; j < apps; j++)
		{
			totalMemory += input.nextInt();
			input.nextLine();
		}
		
		return totalMemory;
	}
	
	public Main()
	{	
		int cases, totalMemory;
		
		cases = input.nextInt();
		input.nextLine();
		
		for(int i = 1; i <= cases; i++)
		{
			totalMemory = calcTotalMemory();
			
			if(totalMemory <= 16000)
				System.out.println("Case #" + i + ": 16GB");
			else if(totalMemory <= 32000)
				System.out.println("Case #" + i + ": 32GB");
			else if(totalMemory <= 64000)
				System.out.println("Case #" + i + ": 64GB");
			else if(totalMemory <= 128000)
				System.out.println("Case #" + i + ": 128GB");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Main();
	}

}