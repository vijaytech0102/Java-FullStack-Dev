package statement;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Jump Statement-->>> 1.Continue 2.Break 
		// 1. Continue --> It is used for skipping particular set of statement
//		for(int i=1; i<=10; i++)
//		{
//			if(i%2==0)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}
		// break-->It terminates particular set of statements
		for(int i=1; i<=50; i++)
		{
			if(i==25)
			  {
				break;
			  }
			if(i%2==0)
				{
					continue;
				}
			System.out.println(i);
		 }
		}
		
	}

