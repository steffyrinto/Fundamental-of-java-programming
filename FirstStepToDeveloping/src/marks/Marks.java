package marks;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the marks of students");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
				max=arr[i];
				arr[i]=arr[j];
				arr[j]=max;
			}
		}
		}
		System.out.println("The priority of marks is");
		
			for(int i=0;i<n;i++) 
			{
				System.out.println(arr[i]);
			}
}
}
