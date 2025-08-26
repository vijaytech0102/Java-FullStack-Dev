package basic;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		byte a=10;
		Byte b = Byte.valueOf((byte)10);
		System.out.println(b);
		System.out.println(a);
		int num1=90;
		int num2=78;
		int ans=num1==num2?num1:num2; // shorthand of if else statement
		System.out.println(ans);
		
		if(num1>num2)
		{
			ans=num1;
		}
		else {
			ans=num2;
		}
		System.out.println(~ans);
		System.out.println(ans--);
		System.out.println(--ans);
		
		// Assignment operator  -> =
		// Binary ---> 1. Arithmetic 2.Relation 3.Logical 4. Bitwise operator
		//Arithmetic --> +,-,*,/,% --> takes two operands
		ans=num1%num2; 
		System.out.println(ans);
		int x = 5, y = 10;
		System.out.println(x == y); // false
		System.out.println(x < y); // true
		
		int p=90,q=56, r=78;
		if(p>q && p>r)
		{
			System.out.println(p);
		}
		else if(q>r)
		{
			System.out.println(q);
		}
		else {
			System.out.println(r);
		}
		
		
		int x1 = 5; // Binary: 0101
		int y1 = 3; // Binary: 0011
		System.out.println(x1 & y1); // 1 (0001)
		System.out.println(x1 << 1); // 10 (1010)
		int a1 = 10, b1 = 20;
		int max = (a1 > b1) ? a1 : b1; // max = 20
		System.out.print(max);
		// 5--> 101--> count set bit 1
		int k=5;
		int count=0;
		while(k!=0) 
		{
			count+=k&1;
			k>>=1; // 
		}
		System.out.println("Count of set bits :"+count);
		
		// What is statement--> Set of expression
		// Statements-->> 1. Conditional Statement 2. Iteration/Loop 3. Jump Statement
	}
}
