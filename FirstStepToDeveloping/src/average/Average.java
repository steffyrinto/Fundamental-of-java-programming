package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int sum=0,a;
		int arr[]=new int[n];
		System.out.println("Enter the marks of students");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The average is ");
		a=sum/n;
		System.out.println(a);
		
		}
		

	}

