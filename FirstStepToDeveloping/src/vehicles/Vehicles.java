package vehicles;

import java.util.Scanner;

public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,b=0;
		System.out.println("Enter the fare collected for each vehicles");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>=50)
			{
			count++	;
			}
			else if((a[i]>0) && (a[i]<50))
			{
				b++;
			}
		}
			System.out.println("Number of heavy vehicles "+count+" and the number of light weight vehicles is "+b);
		

	}

}
