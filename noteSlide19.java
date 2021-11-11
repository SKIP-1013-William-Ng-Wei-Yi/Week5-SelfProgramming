package selfProgramming;

public class noteSlide19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 500;
		int balance = 800;
		
		if ((amount <= 1000.0) && (amount <= balance))
		{
			balance = balance - amount;
			System.out.println("Acct new balance = RM"+balance);
		}
		
	}

}
