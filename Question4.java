package Loops;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		int i=0;
		int j=str.length()-1;
		boolean flag=true;  //
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag==true) System.out.println("Palindrome!!");
		else System.out.println("Not palindrome!!");
			
	}

}
