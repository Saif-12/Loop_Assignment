package Loops;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1,b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}
}
