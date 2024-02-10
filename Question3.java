package Loops;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the first number: ");  
        int num1 = sc.nextInt();  
        System.out.println("Enter the second number: ");  
        int num2 = sc.nextInt();  
        while(num1 != num2) 
        {
          if(num1 > num2) 
          {
            num1 -= num2;
          }
          else 
          {
            num2 -= num1;
          }
        }
      System.out.println("HCF of given two numbers is :"+num1);

	}

}
