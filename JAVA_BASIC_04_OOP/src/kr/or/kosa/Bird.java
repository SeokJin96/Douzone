package kr.or.kosa;

// 새 (공통 : 일반, 추상) : 새는 날 수 있다, 새는 빠르다
public class Bird {
	//공통 가능
	public void fly() {
		System.out.println("flying");
	}
	//설계자 고민
	//Bird 상속하는 당신은 moveFast() 자원에 대해서 재정의해서 써야해 ...강제...
	
	protected void moveFast() {
		fly();
	}
}