import java.util.Scanner;

public class Main {
	public Scanner input = new Scanner(System.in);
	
	public double calcArithmeticSequence(int n)
	{
		return (n / 2.0) * (2.0 + (n - 1.0));
	}
	
	public boolean isBeautiful(int number)
	{
		int counter = 1;
		
		while(true)
		{
			if(calcArithmeticSequence(counter) == number)
			{
				return true;
			}
			else if(calcArithmeticSequence(counter) < number)
			{
				System.out.println(" -> " + calcArithmeticSequence(counter));
				counter++;
				continue;
			}
			else
			{
				return false;
			}
		}
	}
	
	public Main()
	{	
		for(int j = 1; j <= 100; j++)
		{
			if(isBeautiful(j))
				System.out.println(j + " : YES");
			else
				System.out.println(j + " : NO");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Main();
	}

}