package bid;

import java.util.Scanner;

public class Bid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of applications");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the amount(in crores");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("The winning bid is "+max+" crores");
		
	}

}
