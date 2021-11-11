package selfProgramming;

public class note2Slide30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark = 50;
		char grade;
		
		if((mark >= 90) && (mark <= 100)) 
		{
			grade = 'A';
		}
		else if((mark >= 90) && (mark <= 89))
		{
			grade = 'B';
		}
		else if((mark >= 70) && (mark <= 79))
		{
			grade = 'C';
		}
		else if((mark >= 60) && (mark <= 69))
		{
			grade = 'D';
		}
		else if((mark >= 0) && (mark >= 59))
		{
			grade = 'F';
		}
		
		System.out.println(mark);
		System.out.println("grade"+grade);
	}

}
