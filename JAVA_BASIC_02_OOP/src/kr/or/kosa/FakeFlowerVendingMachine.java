package kr.or.kosa;
import java.util.*;

class Flower{
	private String fname;
	 private int fprice;
	
	
	public Flower(String fname, int fprice){
		this.fname=fname;
		this.fprice=fprice;
	}
	
	public String getFlowerName() {
		return fname;
	}
	
	public int getFlowerPrice() {
		return fprice;
	}
}



public class FakeFlowerVendingMachine {

	Scanner sc = new Scanner(System.in);
	
	private int serialNum;
	private String brandName;
	private int asPeriod;
		
	
	
	
	
	public int viewMenu() {
		System.out.println("************");
		System.out.println("***조화 자판기***");
		System.out.println("1.장미");
		System.out.println();
		System.out.println("2.카네이션");
		System.out.println();
		System.out.println("3.무궁화");
		System.out.println();
		System.out.println("4.국화");
		System.out.println();
		System.out.println("5. 프로그램 종료");
		System.out.println();
		
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine()); //1 or 2 입력 
				if(menu >= 1 && menu <= 5) {
					break; //do~while 탈출
				}else {
					//1보다 작고  4 보다 큰값 
					//나는 실제 오류가 아니지만 (예외가 아니지만) 
					//이런 상황을 예외를 만들 수 있어요
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			}catch (Exception e) {
				System.out.println("원인파일 : " + e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("1~4까지 번호만 입력해");
			}
		}while(true);
		
		//1~4까지 중 하나를 선택했다면
		return menu;
	}





	public boolean isConfirmed(Flower selectedFw) {
		if(selectedFw==null) {return false;}		
		System.out.printf("선택하신 상품은 [%s], 가격은 [%d]입니다.\n",selectedFw.getFlowerName(), selectedFw.getFlowerPrice());
		System.out.println("결제하시겠습니까?");
		System.out.println("1.Yes\t2.No");
		Scanner sc2 = new Scanner(System.in);
		int inputValue = sc2.nextInt();
		if(inputValue == 1) {return true;}
		else if(inputValue == 2 ){return false;}
		else {System.out.println("1(결제) 혹은 2(취소) 숫자를 눌러주세요");}
		return true;	
	}



	public int buyFw(Flower selectedFw) {
		int change = 0;
		System.out.println("금액 투입");
		return change;
	}
	
	
	
	
	
}
