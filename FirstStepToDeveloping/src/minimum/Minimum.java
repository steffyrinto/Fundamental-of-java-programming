package minimum;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		int v = 0;
		int a[]=new int[n];
		System.out.println("Enter the number of fouls made by each player");

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				v=i+1;
			}
		}
			System.out.println("The eligible player is player no:"+v+"("+min+" fouls)");
		
	}

}
