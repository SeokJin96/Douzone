/*
 	함수 사용시 parameter 값을 전달 or 주소값(참조값) resf 전달
 	void m (int x) {
 		x값 출력 : 100
 		x = 1000000;
 	}  x라는 변수는 값을 받는다.
 	
 	int y = 100;
 	호출m(y)
 	
 	
 	call by value
 	-----------------------------------------------------------------
 	void m2(Car c){ 
 		c.color 출력 : red
 	} // c라는 parameter는 Car 타입을 가지는 객체의 [주소값] 받겠다
 									// type이 8+1 형태가 아니면 무조건 [주소값] 받는다.
 									  
 	Car c2 = new Car(); //c2의 주소가 : 0xab...
 	c2.color = "red";
 	m2(c2)       >> m2(0xab...)
 	
 	
 	call my reference
 	-----------------------------------------------------------------------
 */

class Data {
	int i;
}

public class Ex10_Method_Call {
			static void scall(Data sdata) {  //Data 타입을 갖는 주소값을 받겠다...
					System.out.println("함수 : " + sdata.i);
					sdata.i = 1111;    // 0xaaaa번지에 있는 i라는 변수 값을 1111로 바꿈
			}
			
			static void vcall(int x) { // 정수값을 받겠다 (value)
					System.out.println("befor x : " + x );
					x=8888;
					System.out.println("after x : " + x);
			}
	public static void main(String[] args) {
		
		Data d = new Data(); // d변수는 주소값을 갖는다 0xab..번지
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d);
		System.out.println("after d.i : " + d.i);
		
		///////////////////////////////////////////////
		
		vcall(d.i);    // 1111
		System.out.println("after d.i : " +d.i );
			
	}

}
