import kr.or.kosa.Pclass;

/*
 private
 default
 public
 상속관계에서의 (protected)
 
 protected 양면성 >> default, public
 >> 상속이 없는 클래스 안에서 protected >> default 동일
 >> 결국 상속관계에서만 의미 >> public
 
 
 */

class Dclass{
	public int i;
	private int p;
	int s; //default
	protected int k; //default 동일 (상속이 아니면 사용하지 않아요)
}

class Child2 extends Pclass{ // 상속
	void method() {
		this.k = 100; // 상속관계에서 >> 자식은 부모의 protected 자원을 사용 가능(public처럼)
		System.out.println(this.k);
		//m(); 상속관계에서 자식이 접근은 가능
	}
	//protected 진정한 의미 (함수) : 재정의를 했으면 좋겠는데 .... (함수라면) 재정의해!!!!!!!!!!

	@Override
	protected void m() {
		// TODO Auto-generated method stub
		super.m();
	}
	
}





public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass pclass = new Pclass();
		//pclass.i public만 접근
		Child2 child = new Child2();

	}

}
