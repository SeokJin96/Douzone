import java.util.*;
public class Ex07_printf_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println()
		//C# : Consle.WriteLine()
		
		System.out.println( "A"); // 출력하고 줄바꿈하겠다 (엔터)
		System.out.println();
		System.out.println("B");
		
		int num=1000;
		System.out.println(num);
		System.out.println("num 값은" + num + "입니다");
		
		//형식 format
		System.out.printf("num 값은 %d 입니다.",num);
		System.out.println( );
		System.out.printf("num 같은 [%d] 입니다. 또 [%d]도 있어요 \n", num, 12345);
		
		/*
		  %d 10진수 형식의 정수
		  %f  실수
		  %s 문자열
		  %c 문자
		  \t (tab), \n(줄바꿈)
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f변수값은 %f 입니다. \n",f );
		
		
		
		//cmd 모드 (console 창에서) 사용자가 입력한 값을 read...
		Scanner sc = new Scanner(System.in); //static final
		//String value = sc.nextLine(); //입력하고 enter 칠때까지 대기
		//System.out.println(value);
		
		/*
		int number = sc.nextInt(); // 사용자가 입력한 값을 정수로 변환 return하는 함수
		System.out.println(number);
		
		float fnumber = sc.nextFloat();
		
		되도록이면
		권장사항) nextInt, nextFloat 보다는 모든 데이터를 nextLine()으로 read해서
		문자열을 변환하는걸 권장함
		[문자를] -> 숫자 (정수, 실수)
		
		String data = sc.nextLine();
		int idata = Integer.parseInt(data);
		
		Integer.parseInt("1000") - > 1000
		Float.parseFloat("3.14") -> 3.14
		
		String str = "10";
		int value = Integer.parseInt(str);
		*/
		
		System.out.print("숫자를 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.printf("입력한 숫자 : %d", number );
		
		
		
	}

}
