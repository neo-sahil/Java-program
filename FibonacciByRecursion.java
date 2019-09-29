package yoPackage;
import java.util.*;

public class FibonacciByRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FibonacciByRecursion a1 = new  FibonacciByRecursion();
		
		System.out.println("Enter the term upto you want the Fibonacci series:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(a1.fun(i)+" ");
		}
	}
	int fun(int n)
	{
		if(n==1 || n==2)
			return 1;
		else
			return(fun(n-1)+fun(n-2));
	}

}
