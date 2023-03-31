package kr.or.kosa;

public class FakeFlowerVendingMachine321 {
	private int serialNum;
	private String brandName;
	private int asPeriod;
		
	class Flower{
		String fname;
		int fprice;
		
		Flower(){
			
		}
		
		Flower(String fname, int fprice){
			this.fname=fname;
			this.fprice=fprice;
		}
		
		void flowerInfo() {
			System.out.println("꽃의 이름은 "+this.fname+ "가격은" + this.fprice + "입니다.");
		}
	
	public void showSelectedProduct (int buttonValue) {
		switch(buttonValue) {
		case 1 : flowerInfo(); break;
		case 2 : flowerInfo(); break;
		case 3 : flowerInfo(); break;
		case 4 : flowerInfo();
		}
	}
	
	public void showProductInfo(String productName, int productPrice) {
		System.out.printf("선택하신 상품은 [%s], 가격은 [%d]입미다.\n",productName, productPrice);
		System.out.println("결제하시겠습니까?");
	}
	
	public void buyProduct (boolean answer) {
		if (answer) { /*결제진행 + 상품반환*/ }
		else { /*프로그램 초기화*/ };
	}
	
	public static void main(String[] args) {
		DoWhileMenu menu = new DoWhileMenu();
		while(true) {
			switch (menu.displayMenu()) {
			case 1: menu.inputRecord();
				break;
			case 2: menu.deleteRecord();
				break;
			case 3: menu.sortRecord();	
			    break;
			case 4: System.out.println("프로그램 종료");
			    //return;  >> main 함수 종료
			    System.exit(0); //프로그램 종료(kill)
			}
		}
	}
			Flower flower1 = new Flower("장미" ,10000);
			Flower flower2 = new Flower("카네이션" ,20000);
			Flower flower3 = new Flower("무궁화" ,30000);
			Flower flower4 = new Flower("국화" ,40000);
		
	}
}

