import java.util.*;
public class Daily_Quiz02 {

	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.err.print("삼각형의 밑변 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		for(int i=num1; i>= 1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.printf(" ");
			}
			for(int j=0; j<=num1-i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		
	}

}
