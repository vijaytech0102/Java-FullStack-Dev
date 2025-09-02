package statement;

import java.util.Scanner;

public class WhileLoop {
		
	// While loop used for---> when we don't know about steps;
	//1. intialization 2. test condition 3. increment/ decrement-->> anywhere inside the loop
	// Syntax--> 
	//intialization
//	while(condition)
//	{
//		increment/decrement
//	}
	
	public static void main(String[] args)
	{
	
//	int i=5;
//	while(i>=0)
//	{
//		System.out.print("hello");
//		i--;
//	}
	// sum of digit
	// n=123 sum=6
	
	
	int n;
	Scanner in= new Scanner(System.in);
	System.out.println("Please enter the number:");
	n=in.nextInt();
	int sum=0;
	int rem=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println("Sum of digit:"+sum);
	// 1+2+3=6
	//3+2+1=6
	// digit extraction from a number--> modulous--> 1. 123%10-->3 2. sum+rem= 0+3=3  3.number decrease--> 123/10=12 
	// 								 -->modulous--> 1. 12%10-->2 2. sum+rem= 3+2=5  3.number decrease--> 12/10=1
	//							 -->modulous--> 1. 1%10-->1 2. sum+rem= 5+1=6  3.number decrease--> 1/10=0	
	
	// 1. sum of digit
	//2. reverse a number
	//3.palindrome number ---->>  121--> reverse= 121 palindrome , n=12 reverse--21 not a palidrome 
	//4. Armstrong number ---->>  153-> 1^3+5^3+3^3=153--> armstrong number
	int number;
	System.out.println("Please enter the number:");
	number=in.nextInt();
	int rev=0,r=0;
	int or=number;
	while(number!=0)
	{
		r=number%10;
		rev=rev*10+r;
//		number/=10;
		number=number/10;
	}
	
	if(or==rev)
	{
		System.out.println("Palindrome");
	}else {
		System.out.println("Not a palindrome");
	}
	
	// armstrong number
	int number1;
	System.out.println("Please enter the number:");
	number1=in.nextInt();
	int arm=0,remainder=0;
	int org=number1;
	while(number1!=0)
	{
		remainder=number1%10;
		arm=arm+remainder*remainder*remainder;
//		number/=10;
		number1=number1/10;
	}
	
	if(org==arm)
	{
		System.out.println("Armstrong numnber");
	}else {
		System.out.println("Not a armstrong");
	}
	
	}
}
