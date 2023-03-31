

public class Calulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 95;
		String grade = ""; //A+ or A- or B+ 등등
		
		if(score >=90) {
			grade = "A";
			if(score>=95) {
				grade+="+";
			}else {
				grade+="-";
			}
			// grade = (score > = 80 ? (grade+="+") : (grade+="-");
		}else if(score>=80) {
			grade = "B";
			if(score>=85) {
				grade+="+";
			}else {
				grade+="-";
			}
		}else if(score>=70) {
			grade = "C";
			if(score>=75) {
				grade+="+";
			}else {
				grade+="-";
			}
		}else {
			grade="F";
		}
		System.out.println(grade);
	}

}
