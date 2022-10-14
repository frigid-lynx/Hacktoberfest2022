//java program 
import java.io.*;

class Pattern{

	
	static void printRow(int num)
	{
		
		if (num == 0)
			return;
		System.out.print("* ");

		
		printRow(num - 1);
	}

	static void pattern(int n, int i)
	{
	
		if (n == 0)
			return;
		printRow(i);
		System.out.println();

	
		pattern(n - 1, i + 1);
	}

	
	public static void main(String[] args)
	{

		int n = 5;
		pattern(n, 1);
	}
}
