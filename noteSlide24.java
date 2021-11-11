package selfProgramming;

public class noteSlide24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 800;
		int balance = 1000;
		int overdraft_penalty = 50;
		int age = 30;
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Acct new balance = "+balance);
		}
		else 
		{
			balance = balance - overdraft_penalty;
			System.out.println("Transaction not allowed");
		}
		
		if ((age >= 25) && (age <=50)) 
		{
			System.out.println("You are qualified to apply");
		}
		else 
		{
			System.out.println("You are NOT qualified to apply");
		}
		
	}

}
