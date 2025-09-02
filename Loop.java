package statement;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Loop Statement-->  Repetition statement // Iterative statement --> 
		// 1. for loop 2. while 3. do while
		// loops--> two types --> 1. Entry Controlled loops---> for and while
		// 					---> 2. Exit controlled loop-- do while
		
		// 1. for loop -->>Entry controlled loop ---> definite number of steps.
		// It has three part--> 1.Initialization 2. test condition 3. Increment or Decrement.
		// Syntax--> 
//		for(1. intialization 2. test condition 3. increment/ decrement)
//		{
//			// statements --> for loop body
//		}
		// write a program to print hello world five times  --> 1 to 5 or 5 to 1
		char ch='a';
		for(int i=1; i<=26; i++)
		{
			System.out.println(ch++);
		}
		// nested for--> for inside for
		// Syntax
		
		// 1 2 3  i=1 , j=1,2,3
		// 1 2 3  i=2,  j=1,2,3
		// 1 2 3  i=3,  j=1,2,3
		// two dimension--> row and column
		// row --> outer loop--> i
		// column--> inner loop--> j
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(); // line break
		}
		
	
	
	// * * *
	// * * *
	// * * *
	
	// # * # *
	// # * # *
	// # * # *
	// # * # *
	
	// *       i=1, j=1
	// * *     i=2, j=1,2
	// * * *   i=3, j=1,2,3
	// * * * * i=4, j=1,2,3,4
	                 // j--> 1 to <=i
	
	// A
    // A B
	// A B C
	// A B C D
	// ASCII code--> A-->65 ---> Z--> 90
	for(int i=1; i<=4; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print((char)(j+64));
		}
		System.out.println(); // line break
	}
	
	for(char c='A'; c<='D'; c++)
	{
		for(char j='A'; j<=c; j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	

   //total row=5
	//----1  --> i=1, j=1         space=4 row-1=4
	//---12  --> i=2, j=1,2       space=3 row-2=3 
	//--123  --> i=3, j=1,2,3     space=2 row-3=2
	//-1234  --> i=4, j=1,2,3,4   space=1 row-4=1
	//12345  --> i=5, j=1,2,3,4,5 space=0 row-5=0
	
	for(char i='A'; i<='E'; i++)
	{
		for(int k=1; k<='E'-i; k++)
		{
			System.out.print(" ");
		}
		for(char j='A'; j<=i; j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
//	System.out.println('E'-'A');
	
	// pyramid-->
	//---*
	//--***
	//-*****
	//*******
	// row=4, column=7
	// row1 = i=1, column= j=2*i-1=1 space=row-1=>4-1=3
	// row2 = i=2, column= j=2*2-1=3 space=row-2=>4-2=2
	// row3 = i=3, column= j=2*i-1=5 space=row-3=>4-3=1
	// row4 = i=4, column= j=2*i-1=7 space=row-4=>4-4=0
	for(int i=1; i<=4; i++)
	{
		for(int k=1; k<=4-i; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=2*i-1; j++)
		{
			System.out.print("*");
		}
		System.out.println();
   	  }
	}
}
	

