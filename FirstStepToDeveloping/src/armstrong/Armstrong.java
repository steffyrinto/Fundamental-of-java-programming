package armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0,c,a;
		int d=n;
		while(d>0)
		{
			a=d%10;
			c=a*a*a;
			sum=sum+c;
			d=d/10;
			
		}
		if(n==sum)
		{
			System.out.println("The given number is amstrong");
		}
		else 
		{
			System.out.println("The given number is not amstrong");
		}
		
		

	}

}
