package statement;

import java.util.Scanner;

public class StatementsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// What is statement--> Set of expression
		// Statements-->> 1. Conditional Statement 2. Iteration/Loop 3. Jump Statement
		
		//1. Conditional Statements --> They control flow of execution of the program..// control statement // Decision statements
		// Flow chart 
		// i. if statement
		// ii. nested if statement
		// iii. Multiple if
		// iv. if else statement
		//  v.nested else if statement
		
		// 1. if statement--> It requires true condition to execute its body..
		// syntax
		
		//if(condition)
//		{
			// body
//		}
		// person is eligible for voting?
		int age=90;
		Scanner input= new Scanner(System.in);
//		System.out.println("Enter the age:");
//		age=input.nextInt();
//		int vote;
//		vote=input.nextInt();
//		if(age>=18)
//		{
//			System.out.println("Eligible");
//		}
//		// Multiple if--> When we are using two or ifs
//		// independent -->>
//		// Find the largest number between three numbers
//		int a=90, b=89, c=78;
//		
//		if(a>b && a>c)
//		{
//			System.out.println("a is largesgt:"+a);
//		}
//		if(b>a && b>c)
//		{
//			System.out.println("b is largesgt:"+b);
//		}
//		if(c>a && c>b)
//		{
//			System.out.println("c is largesgt:"+c);
//		}
//		
//		// nested if ->> 
//		
//		// smallest number between three numbers
//		if(a<b)
//		{
//			if(a<c)
//			{
//				System.out.println("a is smallest");
//			}
//		}
//		if(b<a)
//		{
//			if(b<c)
//			{
//				System.out.println("b is smallest");
//			}
//		}
//		if(c<a)
//		{
//			if(c<b)
//			{
//				System.out.println("c is smallest");
//			}
//		}
//		// if else statement --->> if condition is true then if will execute otherwise else will execute
//		
//		// check whether person is eligible for voting or not?
//		if(age>=18)
//		{
//			System.out.println("Elgible for voting:"+age);
//		}
//		else {
//			System.out.println("Not elgible:"+age);
//		}
//		
//		// else if statement-->
//		// Syntax
//		// largest between three numbers
//		
//		if(a>b && a>c)
//		{
//			System.out.println("a is largest:"+a);
//		}
//		else if(b>c)
//		{
//			System.out.println("b is largest:"+b);
//		}
//		else {
//			System.out.println("c is largest:"+c);
//		}
		
		// nested else if statement
		
		System.out.println("Enter the marks:");
		int marks=input.nextInt(); // user input
		// marks --> 100<= and 90> --> A+
		// marks -->  90<= and 80> --> A
		// marks --> 80<= and 70> --> B+
		// marks --> 70<= and 60> --> B
		// marks --> 60<= and 50> --> C
		// marks --> 50<= and 40> --> D
		// marks --> 40<= and 33> --> E
		// marks --> 33< --> fail
		if(marks<=100 && marks>90)
		{
			System.out.println("A+");
		}
		else if(marks<=90 && marks>80)
		{
			System.out.println("A");
		}
		else if(marks<=80 && marks>70) 
		{
			System.out.println("B+");
		}
		else if(marks<=70 && marks>60)
		{
			System.out.println("B");
		}
		else if(marks<=60 && marks>50)
		{
			System.out.println("C");
		}
		else if(marks<=50 && marks>40)
		{
			System.out.println("D");
		}
		else if(marks<=40 && marks>33)
		{
			System.out.println("E");
		}
		else {
			System.out.println("fail");
		}
		
		char day = 1;
		
		switch (day) {
		case 'a': 
				System.out.println("Monday"); 
				break;
		case 2: 
				System.out.println("Tuesday"); 
				break;
		case 3: 
				System.out.println("Wednesday"); 
				break;
		default: 
				System.out.println("Invalid day");
		}
		
	}

}
