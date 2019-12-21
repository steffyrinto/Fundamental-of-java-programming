package jumbled;

import java.util.Scanner;

public class Jumbled {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The number of combination is ");
		System.out.println(fact);
	}

}
