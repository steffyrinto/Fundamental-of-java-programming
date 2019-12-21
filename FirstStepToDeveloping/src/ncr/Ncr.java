package ncr;

import java.util.Scanner;

public class Ncr {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		long n=sc.nextInt();
		long factn=1,factr=1,factnr=1;
		long b=0;
		System.out.println("Enter the value of r");
		long r=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			factn=factn*i;
		}
		for(int i=1;i<=r;i++)
		{
			factr=factr*i;
		}
		for(int i=1;i<=n-r;i++)
		{
			factnr=factnr*i;
		}
		b=factn/(factr*factnr);
		System.out.println("The NCR factor for given values is "+b);
}
}
