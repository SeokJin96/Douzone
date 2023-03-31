import java.util.*;

public class Ex11_FQ {

	public static void main(String[] args) {
		double random = (3*Math.random()+1); //1 <= random < 4;
		System.out.println((int)random);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 가위, 2.바위, 3.보 중 하나를 입력하세요");
		int user = sc.nextInt(), 		result2 = user-(int)random;
		String result = (user==(int)random) ? "비겼습니다.": (Math.abs(result2) ==1 ? "이겼습니다." : "졌습니다." );
		System.out.println(result);
		
	}

}
