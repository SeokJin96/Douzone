
public class Ex09_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 제어문
			 조건문 : if(3가지), switch(조건) {case 값..break}
			 반복문 : for( 반복횟수가 명확){}, while(진위){}, do{} ~ while()
			 분기문 : break(블럭 탈출), continue(아래 구문 skip)
			 */
		int count = 0;
		if(count < 1) System.out.println("true"); //단일 if {}생략 가능
		
		if(count < 1) {
			System.out.println("{true}");
		}
		
		char data='C';
		switch(data) {
						case 'A' : System.out.println("문자 비교 같아요");
										break;
						case 'B' : System.out.println("...");
										break;
						default : System.out.println("나머지 처리");
		}
		
		//for문
		//1~100까지 합
		int sum=0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1~5까지의 합
		// for문과 while 쓰지말고
		sum = 5 * (1+5)/2;
		System.out.println(sum);
		
		//1~10까지의 홀수의 합
		int sum2=0;
		for(int i =1; i<=10; i+=2) {
			sum2 +=i;
		}
		System.out.println(sum2);
		
		
		//for문에서 if문 사용해서 1~1000까지의 짝수의 합
		int sum3=0;
		for(int i=1; i<=1000; i++) {
			if(i%2 == 0) {
				sum3+=i;
			}
		}
		System.out.println(sum3);
		
		//초급자 구구단 못하면...
		//중첩 for문
		//행과 열
		for(int i = 2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
			System.out.println( );
		}
		
		
		for(int i=2; i<9; i++) {
			for(int j=1; j<=9;j++) {
				if(i==j) {
					continue;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		for(int i=2; i<9; i++) {
			for(int j=1; j<i;j++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		//100부터 0까지의 값 출력
		
		for(int i=100; i>=0; i--) {
			System.out.printf("%d\t",i);
		}
		
		
		
		int a = 0, b =1, c =0;
		for(int i = 0; i<10 ; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.printf("[%d]+[%d]=[%d]\t",a,b,c);
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
