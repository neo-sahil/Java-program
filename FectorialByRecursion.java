package yoPackage;
import java.util.*;
public class FectorialByRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FibonacciByRecursion a1 = new FibonacciByRecursion();
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		long a = a1.fun(n);
		System.out.println("Factorial is "+a);
	}
	
	long fun(int n)
	{
		if(n>0)
			return(n*fun(n-1));
		else
			return(1);
	}

}
