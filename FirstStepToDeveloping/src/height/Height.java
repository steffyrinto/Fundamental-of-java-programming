package height;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		double arr[]=new double[n];
		System.out.println("Enter the heights of students");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		double max;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
				max=arr[i];
				arr[i]=arr[j];
				arr[j]=max;
			}
		}
		}
		System.out.println("The heights in order are");
		
			for(int i=0;i<n;i++) 
			{
				System.out.println(arr[i]);
			}
		

	}

}
