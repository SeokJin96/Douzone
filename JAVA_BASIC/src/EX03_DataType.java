import javax.print.attribute.standard.PrinterLocation;

/*
 1. 자바가 제공하는 기본 타입(원시타입) >> 8가지
 2. 8가지 타입은 값을 저장하는 타입
 숫자 정수(음의정수 0 양의정수)
 3.
 
  
  
  논리
  점수는 int, 실수는 double 타입을 사용하면 별 문제 없다.
  
  가장 많이 사용되는 타입 (String)
  String str="홍길동";
  우리가 가장 많이 사용하는 String 은 클래스 입니다.
  String 타입은 문자열을 담을 수 있습니다.
  ex) String str = new String("홍길동");
  약속) 별도의 이야기 ..... 8가지 기본 타입 + 1(String) >> int, long처럼 쓸것 
 
 자바타입은
 1. 값타입 : 8+1 (값을 저장)
 2. 
 
 */

public class EX03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 100000000;
			System.out.println("num : " + num);
			// int num2 = 10000000000; // The literal 10000000000 of type int is out of range
			// literal 개발자가 직접 입력한 값 (있는 그대로의 값)
			// 컴파일 오류
			// 나는 4byte 크기의 방인데 더 큰 값은 담을 수 없어
			
			// 1. 해결방법
			// int num2 = 10000000000;
			long num2 = 10000000000L;
			//개발자가 입력하는 정수 범위는 int를 벗어나면 안된다.
			System.out.println("num2 : " + num2);
			
			long num3 = (long)100; //속지 않을려면 값을 보지 말고 타입을 보세요 (리터럴값도)
										 //long num3 = (long)100
										 //임시적 형변환 (자동으로 컴파일러가 .. 큰타입에 작은 타입을 넣는 것은)
										 //작은 타입에 있는 값을 큰 타입에 넣는 것은 당근이지
			System.out.println("num3 : " + num3);
			
			//해결하세요
			//손실이 발생하더라도 담아 보겠다
			//int num4 = 10000000000; //The literal 10000000000 of type int is out of range 
			//int num4 = 10000000000L; //Type mismatch: cannot convert from long to int
			//담아 담아 (손실 ....) 명시적 형 변환
			int num4 = (int)10000000000L;
			System.out.println("num4 : " + num4);
			
			//데이터 손실이 없어도 다행이다 .. 있을 수도 있어
			//1. 강제 형변환
			//int num5 = (int) 1000L;
			
			//2. 담는 그릇을 크게
			//long num5 = 1000L;
			
			
			
			
			
			//char 2byte : 한 문자를 표현하기 위해서 만든 타입
			// 영문자, 특수문자, 공백, 한글 >>>>>>한문자로 표현하는 표준화
			// 한문자 >> 'A' , '가', '  ' 
			// 문자열 >> "abcd" >> String str="abcd";
			
			
			char ch = '가';
			System.out.println("한문자 : " + ch);
			// char ch2='가나';  예외 발생 (컴파일도 안되요) ... 한문자만 가능
			
			ch = 'a';
			ch = 'A';
			
			// char 정수 타입 (문자를 저장하지만 내부적으로 정수값을 가지고 있다.)
			// 아스키 코드표에서 십진수값과 문자값을 비교해 보세요
			int chint = ch;
			System.out.println("ch 문자를 십진수 보면 : " + chint);
			
			//int chint = ch;
			//내부적으로 암묵적으로 자동 형변환이 발생 했어요(자동으로)
			//int chint = (int)ch;
			
			int chint2 = 'a';
			System.out.println(chint2);
			int intch2 = (int)chint2; //개발자가 직접 형변환 문제 없다
			
			
			int intch3 = 65;
			// char chint3 = intch3; Type mismatch: cannot convert from int to char
			
			//1 해결 (명시적 형변환) >> 데이터 손실 발생
			//char chint3 = (char) intch3;
			
			//2 해결 받는 그릇을 크게 ... (개발자의 의도 문자를 보고 싶어요)
			//int chint3 = intch3;
			
			//char chint =intch3; >> 위로 올라가서 char intch3 = 65;
			
			char chint3 = (char) intch3;
			System.out.println("chint3 가지는 문자값 : " + chint3);
			
			/*
			  1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
			  1.1 리터럴 값에 대해서
			  1.1.1 정수 리터럴의 기본 타입은 int
			  1.1.2  실수 리터럴의 기본 타입은 double
			 
			  2. 암시적 형변환, 명시적 형변환
			  2.1 큰타입에 작은 타입의 값을 넣는 것은 암시적 형변환을 통해서 개발자는 그냥 사용하면된다.
			  2.2 작은 타입에 굳이 큰 타입을 넣고자 한다면 자동 형변환을 지원하지 않기 때문에 강제적 형변환을 해야한다.
			  2.2.1 접미사 L, l , (int)정수, (long)정수
			  KEY POINT 강제적 형변환은 데이터 손실을 감수해야한다. 책임은 개발자 몫
			  ex) char c = (char) int 범위값 ... 손실 발생...
			*/
			
			// String 타입 (8+1) 값타입처럼 사용하자 >> 값타입처럼 써도 문제 없게 만들었어요
			// 문자열 >> 문자의 집합 >> 문자의 배열 >> 문자열
			// int, long 동일하게 사용하세요
			String name = "홍길동";
			name = "홍길동 바보";
			
			String color = "red";
			color = color + "방가방가";  //오라클 + 산술만 해도 >> 결합 연산자 ||
			System.out.println(color);
			
			//TIP)
			//연산자는 언어마다 표현이 달라요
			//JAVA		>>  +산술하고 결합도 해요
			//oracle 	>> +산술만 해요, 결합연산자 ||		'안녕' || '방가방가'>>
			
			// char sing = ''';  //Invalid character constant
			//이스케이프 문자 : 특정 문자 앞에 \다음 값은 데이터 인정
			char sing = '\'';
			System.out.println(sing);
			
			//quiz) 홍"길"동 이라는 문자열을 출력
			String username = "홍\"길\"동";
			System.out.println(username);
			
			String str1 = "1000";
			String str2 = "10";
			String result = str1 + str2;
			System.out.println("result : " + result);
			
			System.out.println("100"+100);
			System.out.println(100+"100");
			System.out.println(100+100+"100");
			System.out.println(100+(100+"100"));
			System.out.println(100+"100"+100);
			
			//quiz 경로 "C:\Temp"
			
			String path = "C:\\Temp";
			System.out.println(path);
			
			//float f = 3.14; //Type mismatch: cannot convert from double to float
			float f = 3.14f;
			float f2 = (float)3.14; //이런 경우 데이터 손실을 가져올 수 있다.
			
			//현명한 개발자
			//처음부터 데이터 타입을 크게 잡아서 사용
			double d = 3.14;
			
			//1. int 4byte < float 4byte
			//2. float과 double 중에서 정밀한 값의 표현 > double
			
			float data = 1.123456789f;
			System.out.println(data);
			
			double data2 = 1.123456789123456789;
			System.out.println(data2);
			
			double data3 = 100;
			System.out.println(data3);
			
			double data4 = 100;
			int number = 100;
			//int result2 = data4 + number; //double + int >>double 
			//해결방법
			//int result2 = (int)(data4 + number); 1번
			// double result2 = data4 + number; 2번
			double result2 = data4 + number;
			System.out.println(result2);
			
			int number2 = 100;
			int b2 = number2;
			System.out.println(b2);
			// Today Point
			//1. 큰타입 + 작은 타입 이 연산결과는 큰타입
			//2. 타입간 변환 >> 변수가 갖는 값을 보지말고 변수의 타입으로 판단하자
			//3. 명시적(강제) 형변환 데이터 손실을 고민하자
			
			int data5 = 100;
			byte b3 = (byte) data5; //명시적 형변환
			
			byte b4 = 20;
			//int data6 = b4; //컴파일러가 내부적으로 암시적 형변환
			int data6 = (int)b4;
			

	}

}
