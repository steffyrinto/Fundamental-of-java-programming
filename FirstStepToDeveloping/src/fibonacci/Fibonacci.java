package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int p1=0,p2=1,p3;
		System.out.print("The fibonacci series is ");
		System.out.print(p1 );
		System.out.print(" "+p2 );
		for(int i=0;i<=n;i++)
		{
			p3=p1+p2;
			System.out.print(" "+p3);
			p1=p2;
			p2=p3;
			
		}
			
	}

}
