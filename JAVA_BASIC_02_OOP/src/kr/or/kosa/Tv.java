package kr.or.kosa;
/*
 	Tv 설계도 요구사항정의
 	1. Tv 채널 정보를 가지고 있다 (예를 들면 1~200 값을 가질 수 있다) public
 	2. Tv 브랜드 이름을 가지고 있다. (예를 들면 엘지. 삼성) public
 	3. Tv는 채널 전환 기능을 가지고 있다(채널은 한 채널씩 이동이 가능하다)
 	   -> 채널을 증가시키는 기능을 가지고 있다.
 	   -> 채널을 감소시키는 기능을 가지고 있다
 	 4. TV의 채널정보와 브랜드 이름을 볼 수 있는(출력) 기능을 가지고 있다.
 */
public class Tv {

		
		public int chinfo() {
			return 50;
		}
		
		public String brandinfo() {
			return "삼성";
		}
		
		public int chplus(int data) {
			return data+=1;
		}
		
		public int chminus(int data) {
			return data-=1;
		}
		
		public String info(int data, String i) {
			return data+i;
		}
		
}
