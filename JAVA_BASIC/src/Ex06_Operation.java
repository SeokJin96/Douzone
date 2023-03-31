
public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//대입 연산자
			// +=, -=, *=, /=
		
		int sum=0;
		sum+=1; // sum=sum+1;
		sum-=1;  // sum = sum-1;
		System.out.println(sum);
		
		/*
		 if(조건식) {}
		 
		 if(조건식) {} else {}
		 
		 if(조건식) {} else if(조건식) {} else if .... else {}
		 
		 간단한 학점 계산기
		 학점 : A+ A- B+ B- ...F
		 
		 판단기준 : 
		 */
		
		
		for(char i = 'A'; i<='Z'; i++) {
			System.out.println(i);
		}
		
		for(char i = 65; i<=90; i++) {
			System.out.println((char) i + "");
		}
		System.out.println();
		
		for(int i =1 ; i <=100; i++) {
			System.out.println(i + "");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
		for(int i = 2; i <= 9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "X" + j + "="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}