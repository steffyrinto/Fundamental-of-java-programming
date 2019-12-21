package bowler;

import java.util.Scanner;

public class Bowler {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int count=0;
		double s;
		double f;
		double sum=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
	double c[]=new double[n];
	System.out.println("Economy of the bowlers is");
	for(int i=0;i<n;i++)
	{
		s=b[i]/6;
		c[i]=a[i]/s;
		System.out.println(c[i]);
	}
	System.out.print("The overall economy of the team is ");
	for(int i=0;i<n;i++)
	{
		sum=sum+c[i];
	}
	f=sum/n;
	System.out.println(f);
	System.out.print("The number of bowlers eligible are ");
	for(int i=0;i<n;i++)
	{
	if(f>c[i])
	{
		count++;
	}}
	System.out.print(count);
}

}