package myProgram;

import java.util.Scanner;

public class DivingSerise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		float sum = 0f;
		
		for(float i=1;i<=n;i++)
		{
			if(!(i%2==0))
				sum += 1/i;
			else
				sum -= 1/i;
				
		}
		
		System.out.println("Sum of the serise is "+sum);

	}

}
