package selfProgramming;

public class noteSlide15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 30;
		int balance = 50;
		
		if (amount <= balance) // in block statement
		{
			balance = balance - amount;
			System.out.println("Acct new balance = " + balance);
		}
		
		if (amount <= balance) // not in block statement
		
			balance = balance - amount;
			System.out.println("Acct new balance = " + balance);
		

	}

}
