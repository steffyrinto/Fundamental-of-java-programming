package retest;

import java.util.Scanner;

public class Retest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		System.out.println("Enter the marks of students");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<50)
			{
				count++;
			}
		}
		System.out.println("Number of students appearing for retest is ");
		System.out.println(count);
	}

}
