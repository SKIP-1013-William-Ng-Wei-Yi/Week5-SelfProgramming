package selfProgramming;

public class noteSlide16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int income = 5000;
		int income2 = 2800;
		int min_level = 3000;
		int age = 45;
		int age2 = 60;
		
		if ((income > min_level) && (age <50))
			System.out.println("Can apply laon");
		
		if ((income2 < min_level) && (age2 > 50))
			System.out.println("Cannot Apply for loan");
		
	}

}
