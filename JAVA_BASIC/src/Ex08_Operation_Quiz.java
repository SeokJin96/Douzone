import java.util.*;
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		int number1 = Integer.parseInt(sc.nextLine());
		System.out.print("입력값(기호) : ");
		String str = sc.nextLine();
		System.out.print("입력값 : ");
		int number2 = Integer.parseInt(sc.nextLine());
		
		switch(str) {
		case  "+": System.out.printf("입력값 : %d" , (number1+number2));break;
		case  "-": System.out.printf("입력값 : %d" , (number1-number2));break;
		case  "*": System.out.printf("입력값 : %d" , (number1*number2));break;
		case  "/": System.out.printf(
				"입력값 : %d" , (number1/number2));break;
			
		}
		

	}

}
