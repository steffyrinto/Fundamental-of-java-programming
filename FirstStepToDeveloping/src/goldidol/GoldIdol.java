package goldidol;

import java.util.Scanner;

public class GoldIdol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		int n=sc.nextInt();
		int num=n/5;
		int a=0;
		if(num>5)
		{
			a=num/5;
		}
		n=n+num+a;
		System.out.println("Number of Sculptors can be made is "+n);
	}

}
