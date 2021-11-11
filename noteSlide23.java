package selfProgramming;

public class noteSlide23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 1000;
		int amount = 800;
		int over_penalty = 50;
		
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println(balance);}
		else
		{
			balance = balance - over_penalty;
			System.out.println(balance);}
	}

}
