import java.util.*;
public class IntegerToString {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    String s1=Integer.toString(num1);
    String s2=Integer.toString(num2);
    if(s1.compareTo(s2)==0)
    {
    	System.out.println("equal");
    }
    else if(s1.compareTo(s2)<0)
    {
    	System.out.println(num2+" is greatest");
    }
    else
    	System.out.println(num1 +" is greatest");
	}
}