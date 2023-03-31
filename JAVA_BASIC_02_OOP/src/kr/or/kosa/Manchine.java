package kr.or.kosa;


public class Manchine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FakeFlowerVendingMachine menu = new FakeFlowerVendingMachine();
		Flower fw1 = new Flower("장미", 10000);
		Flower fw2 = new Flower("카네이션", 20000);
		Flower fw3 = new Flower("무궁화", 30000);
		Flower fw4 = new Flower("국화", 40000);

		Flower selectedFw = new Flower(null, 0);
		FakeFlowerVendingMachine fm = new FakeFlowerVendingMachine();
		while(true) {
			
			switch (menu.viewMenu()) {
			case 1: selectedFw = fw1;
				break;
			case 2: selectedFw = fw2;
				break;
			case 3: selectedFw = fw3;
			    break;
			case 4: selectedFw = fw4;
				break;
			case 5: System.out.println("프로그램 종료");
			    //return;  >> main 함수 종료
			    System.exit(0); //프로그램 종료(kill)
			}
			if(fm.isConfirmed(selectedFw)) {
				System.out.println(fm.buyFw(selectedFw));
			}
		}
		
		
		
		
		
	}

}
