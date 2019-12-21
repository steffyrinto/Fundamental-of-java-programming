package perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0,a;
		System.out.print("The divisors of the number are ");
		for(int i=1;i<n;i++)
		{
				if(n%i==0)
			     {
					a=i;
					System.out.print(" "+a);
					sum=sum+i;	

			}
		}
				System.out.println();
		System.out.println("The sum of the divisors are "+sum);
		if(n==sum)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
	}
}

