import java.util.*;


public class Ex10_Statement {

	public static void main(String[] args) {
		int i = 10;
		while(i>=10) {
			//반드시
			//증가감을 통해서 true, false 판단
			System.out.println(i);
			--i;
		}
		int sum=0;
		int j=1;
		while(j<=100) {
			//j++;
			sum+=j;
			j++;
		}
		System.out.println(sum);
		
		
		
		
		int k = 2;
		int p = 1;
			while(p <=9) {
				p =1;
				while(p<=9) {
					System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
					p++;
				}
				System.out.println();
				k++;
			}
			System.out.printf("k:%d, p:%d \n",k,p);
		
			
			Scanner sc = new Scanner(System.in);
			int inputData=0;
			do {
				System.out.println("숫자 입력해 0~9");
				inputData = Integer.parseInt(sc.nextLine());
			}while (inputData >=10);
			
			System.out.println();
			
			
			
	}
	}

