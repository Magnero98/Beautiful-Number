import java.util.Scanner;

public class Main {
	public Scanner input = new Scanner(System.in);
	
	
	public Main()
	{	
		int cases, wordsAmount, four, five, six;
		String word;
		
		cases = input.nextInt();
		input.nextLine();
		
		for(int i = 1; i <= cases; i++)
		{
			wordsAmount = input.nextInt();
			input.nextLine();
			
			four = five = six = 0;
			
			for(int j = 0; j < wordsAmount; j++)
			{
				word = input.nextLine();
				
				if(word.length() == 4)
					four++;
				else if(word.length() == 5)
					five++;
				else if(word.length() == 6)
					six++;
			}
			
			System.out.println("Case #" + i + ": " + four + " " + five + " " + six);
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Main();
	}

}