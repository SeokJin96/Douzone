import java.util.*;


public class Ex11_Statement_Quiz {

	public static void main(String[] args) {
			int balance = 0;
			boolean var = true;
			
			while(var) {
				System.out.println("1. 예금");
				System.out.println("2. 출금");
				System.out.println("3. 조회");
				System.out.println("4. 종료");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("원하시는 메뉴의 번호를 입력하세요");
				int inputData = Integer.parseInt(sc.nextLine());
				switch(inputData) {
				case 1 : {
					System.out.println("입금하실 금액을 입력하세요");
					balance += sc.nextInt();
					break;
				}
				case 2 : {
					System.out.println("출금하실 금액을 입력하세요");
					if(balance>=sc.nextInt()) {
					balance -= sc.nextInt();
					}
					System.out.println("도둑놈");
					break;
				}
				case 3 : {
					System.out.println("잔액은 " + balance + "원 입니다.");
					break;
				}
				case 4 : {
					System.out.println("종료되었습니다.");
					var = false;
					break;
				}
				default :{
					System.out.println("잘못된 숫자를 입력하셨습니다.");
				}
				}
			}

	}

}
