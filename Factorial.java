package myProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter a number to find its factorail:");
         int a = sc.nextInt();
         int fac = 1;         
         for(int i=a;i>=1;i--)
         {
        	 fac =fac * i;
         }
         System.out.println("The factorial of "+a+" is "+fac);

	}

}
