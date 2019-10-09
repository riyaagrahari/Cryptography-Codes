import java.util.*;

class BruteForce
{
	private static final int password = (int)(Math.random() * 10000);
	public static void main(String args[])
	{
		for(int i=0;i<=10000;i++)
		{
			if(i == password)
			{
				System.out.println("Password cracked !");
				System.out.println("The password is "+i); 
			}
		}
	}
}
