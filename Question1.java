package Loops;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		
	}

}
