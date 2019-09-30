package yoPackage;
import java.util.*;
public class GcdByRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GcdByRecursion a1 = new GcdByRecursion();
		System.out.println("Enter any two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("GCD is "+a1.GCD(a,b));
	}
	int GCD(int a,int b)
	{
		if(a==b)
			return(a);
		if(a%b==0)
			return(b);
		if(b%a==0)
			return(a);
		if(a>b)
			return(GCD(a%b,b));
		else
			return(GCD(a,b%a));
	}

}
