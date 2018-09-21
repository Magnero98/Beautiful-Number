import java.util.Scanner;
import java.math.*;

public class Main {
	public Scanner input = new Scanner(System.in);
	
	public class Distance
	{
		int vertical;
		int horizontal;
		
		public Distance(int _vertical, int _horizontal)
		{
			this.vertical = _vertical;
			this.horizontal = _horizontal;
		}
	}
	
	private Distance calcMovement(String command)
	{
		Distance _distance = new Distance(0, 0);
		
		for(int i = 0; i < command.length(); i++)
		{
			if(command.charAt(i) == 'N')
				_distance.vertical++;
			else if(command.charAt(i) == 'S')
				_distance.vertical--;
			else if(command.charAt(i) == 'E')
				_distance.horizontal++;
			else if(command.charAt(i) == 'W')
				_distance.horizontal--;
		}
		
		return _distance;
	}
	
	private int calcTheDistance(Distance _distance)
	{
		return Math.abs(_distance.vertical) + Math.abs(_distance.horizontal);
	}
	
	public Main()
	{	
		Distance _distance;
		String command;
		
		command = input.nextLine();
		
		_distance = calcMovement(command);
		System.out.println(calcTheDistance(_distance));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Main();
	}

}