
public class Ex05_Operation {

	public static void main(String[] args) {
		//연산자 (산술, 논리, 관계)
		int result = 100 / 100;
		System.out.println(result);
		
		result = 13/2; //몫
		System.out.println(result);
		
		//나머지를 구하는 연산자(%)
		result = 13 % 2;
		System.out.println(result);
		
		//증가 , 감사 (증가감 연산자 : == 1씩증가 . -- 1씩감소)
		int i = 10;
		++i ; //전치증가
		System.out.println(i);
		i++; //후치증가
		System.out.println(i);
		//다른 연산과 결합되지 않고 혼자서 있으면 전치와 후치는 의미가 없다
		
		
		//Today point (증가감 연산자와 다른 연산이 결합되면)
		int i2 = 5;
		int j2 = 4;
		
	//	int result2 = i2 + ++j2; //전치가 먼저 동작
	//	System.out.println(result2);
		
		int result2 = i2 + j2++;
		System.out.println(result2);
		
		byte b = 100;
		byte b2 = 1;
		
		//byte b3 = b _ b2; //Type mismatch: cannot convert from int to byte
		//연산시 자바는 기본적으로 4byte 공간을 만들고 공간에 값을 넣고 연산 (int + int)
		
		//byte b3 = (byte)(b + b2); //손실이 발생할 수 있따.
		//System.out.println("b3 : " + b3);
		
		int b3 = b + b2; //손실이 발생하지 않는다
		System.out.println(b3);
		
		/*
		 		Today point
		 		1. 정수의 연산은 [int] 타입으로 변환 후 처리된다
		 		ex) byte + short >> 컴파일러가 내부적으로 값들을 int 방에 넣고 처리 >> int + int 처리
		 		ex) char + char >> 컴파일러가 내부적으로 int + int 처리
		 		정수의 연산에 int 보다 작은 타입들은 내부적으로 모두 int 바꾸어 연산처리된다
		 		정수에서 long 예외 .... 나머지는 byte, char, short >> int 전환 후 처리
		 		ex) char + int >> int,
		 			   int + int >> int,
		 			   int + long >> long (예외)
		 			   
		 		2. 정수 + 실수 >> 타입의 크기와 상관없이 >> 실수가 승자
		 */
			
		
		long lo = 100000000L;
		float fo = 1.2f;
		//long result3 = (long) (lo + fo); //1번 가능
		
		float result3 = lo + fo; //2번 가능
		//실수가 큰 타입
		
		 char c2 = '!';
		 char c3 = '!';
		 int result4 = c2 + c3;
		 System.out.println(result4);
		 
		 
		 //변수 >> 타입(자료형) >> 연산(산술, 논리, 관계) >> 제어문(if, for, while...)
		
		int sum=0;
		for(int j=0; j <= 100 ; j++) { //for(int j = 0 j라는 변수는 Scope j=블록변수
		//	sum = sum + j;
			if(j%2==0) {
				sum+=j;
			}
		}
		//System.out.println(sum); //5050
		System.out.println(sum); 
		
		//== 연산자 (값을 비교하는 연산자)
		if(10 == 10.0f) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//! = 부정연산자
		if('A' != 65) {
			System.out.println("같다 : true");
		}else {
			System.out.println("같지 않다:false");
		}
		
		
		//Today Point
		//연산자 중에서 제어문 역할 (조건, 반복)
		//삼항연산자
		int p=10;
		int k=-10;
		int result5 = (p==k) ? p:k;
		System.out.println(result5);
		if(p==k) {
			System.out.println(p);
		}else {
			System.out.println(k);
		}
		
		/*
		진리표 (논리연산)
		0: 거짓(false)
		1:참(true)
		
		OR 연산, AND 연산
		
		DB 쿼리 Oracle)
		SQL 자연어 ...
		select * from emp where job='IT' and sal > 3000
		select * from emp where job='IT' or sal > 3000
	
						AND 		,	 	 OR
		0		0			0						0
		0		1			0						1
		1		0			0						1
		1		1			1						1
		 */
		int x = 3;
		int y = 5;
		System.out.println(x|y);
		/*
		 256	128	64	32	16	8	4	2	1
		 											0	0	1	1 		>>	3
		 											0	1	0	1		>>	5
		 											0	1	1	1		>>	| 비트 OR 연산
		 												4+2+1	>>	7		
		 */
		System.out.println(x&y);
		/*
		 256	128	64	32	16	8	4	2	1
		 											0	0	1	1 		>>	3
		 											0	1	0	1		>>	5
		 											0	0	0	1		>>	| 비트 and 연산
		 														1		>>	1
		 														
		 																
		 																
		 Today Point
		 (&& >> and 연산)
		 (||>> or 연산)
		 if(10>0 && -1 > 1 && 100 > 2&& 1 > -1) {A} else {B} ... 거짓이 나오면 끝
		 if(10>0 || -1 > 1 || 100 > 2|| 1 > -1) {A} else {B} ... 참이 나오면 끝
		 
		 */
		
		
		//  switch(조건) 정수만 가능한게 아니라
		// 						  문자 또는 문자열도 가능하다.
		
		int data = 90;
		switch(data) {
			case 100 : System.out.println("100입니다."); break;
			case 90 : System.out.println("90입니다."); break;
			case 80 : System.out.println("80입니다."); break;
			case 70 : System.out.println("70입니다."); break;
			default : System.out.println("일치하는 값이 없습니다.");
		}
		
		int month=3;
		String res=""; //빈 문자열로 초기화
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: res = "31일"; break;
		case 4: case 6: case 9: case 11: res="30일"; break;
		case 2: res="29일";break;
		default : res = "월 데이터가 아닙니다.";
		}
		
		System.out.println(month + "월은 " + res + " 일자까지입니다.");
		
		
		//난수 (랜덤값 , 임의의 추출값) 을 얻기를 원해요
		//쉬운방법 : 구글검색
		//자바가 만들어준 자습서 (API 문서) 자원에 설명과 사용방법 (영어)
		//https://docs.oracle.com/javase/8/docs/api/index.html 검색
		//패키지 기준 (폴더별로 자원을 모아놨음)
		//java.lang.Math 클래스를 활용하면 여러가지 수학적인 기능을 활용할 수 있음
		//import java.lang.*; 생략.. default open
		
		
		//public static double random();
		//double greater than or equal to 0.0 and less than 1.0
		//결과 : 0.0 <= random <1.0
		
		System.out.println("Math.random() : " +  Math.random());
		
		System.out.println("Math.random() : " +  (Math.random())*10); //0~9
		
		System.out.println( (int)((Math.random() * 10) +1 )*100); //1~10까지 난수(중복값 나옴)
		
		
		
		
		
	}

}
