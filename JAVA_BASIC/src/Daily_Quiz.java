import java.util.*;
public class Daily_Quiz {

	public static void main(String[] args) {
			int UNIT = 10000;
			int NUM = 0;
			int SW = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("금액을 입력하세요 : ");
			int MONEY = Integer.parseInt(sc.nextLine());
			
			while(true) {
				NUM=(MONEY/UNIT);
				System.out.println( UNIT + "원짜리 "+ NUM + "개");
				if(UNIT>1) {
					MONEY=MONEY-UNIT*NUM;
					if(SW==0) {
						UNIT = UNIT/2;
						SW=1;
					}else {
						UNIT=UNIT/5;
						SW=0;
					}
				}else break;
			}
			sc.close();
	}

}
