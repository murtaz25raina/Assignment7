
import java.util.Scanner;
import java.util.*;

class StringToInteger
{
	public static void main(String ars[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		String num1=s.nextLine();
		System.out.println("Enter 2nd Number");
		String num2=s.nextLine();
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else
		{
			int max=((a>b)?a:b);
			System.out.println("Greater number is "+max);
		}
		
		
	}
}	


    	


    	
	
