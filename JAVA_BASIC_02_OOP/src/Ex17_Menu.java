import kr.or.kosa.DoWhileMenu;

public class Ex17_Menu {

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

	}

