package myProgram;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms you want of the fibonacci sequence:");
		
		int n=sc.nextInt();
		
		int a[]=new int[100];
		
		a[0]=0;
		a[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		
		System.out.println("The fibonacci sequence is:");
		
		for(int i=0;i<=n;i++)
			System.out.print(" "+a[i]);
	}

}
