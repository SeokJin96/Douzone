/*
 OOP(Object Oriented Programming)특징 (여러개의 작은조각(클래스) 들을 조립해서 하나의 큰 그림(제품)을 만드는 행위
 설계도 : 메인 설계도의 부분 설계도 , 메인 설계도의 하위 설계도, 별도로 독립적인 설계도 ...
 
 1.상속(Inheritance)
 2.캡슐화(은닉화) >> private(직접할당을 막고 간접 할당을 취하게 한다)
 3.다형성 (상속관계에서 부모타입이 자식타입의 주소를 가질 수 있다.)
 
  상속
  JAVA	: child extends Base
  C#		: child : Base
  
  
  특징
  1. 다중 상속 불가 (단일 상속이 원칙 >> 계층적 상속으로 해결)
  2. 계층적 상속(여러개의 클래스를 상속)
  3. 다중 상속 지원은 interface만 (표준, 약속, 규칙, 규약)을 정의하고 있는 클래스
 
  상속
  1. 진정한 의미 : 재사용성
  2. 단점 : 1) 비용(초기 설계 비용)이 많이 든다	2) 종속적(..부모 자식관계가 너무 끈끈함) >> 느슨한 관계를 좋아합니다.
  3. 재사용성 >> 설계 >> 시간 >> 뽕 뽑는다
  
   모든 클래스는 메모리에 올라가야 사용가능
  
  메모리 올라가는 순서
  Child child = new Child();
  ->  Object >> GrandFather >> Father >> Child
  
  사용자가 만드는 모든 클래스는 default (명시하지 않아요) : Object 상속한다
  class Car extends Object 생략
  Object >> Root >> 최상위 >> 모든 클래스의 부모 >> 단군
 */
class Car{
	
}

class GrandFather{
	public int gmoney=5000;
	private int pmoney = 10000; //// private으로 하면 자식클래스도 못 씀
											//public 함수 생성 (간접적으로 접근...)
	//객체생성과 동시에 호출되는 함수(생성자)
	public GrandFather() {
		System.out.println("GrandFater 생성자");
	}
}

class Father extends GrandFather{
	public int fmoney=3000;
	public Father() {
		System.out.println("Fater 생성자");
	}
}

class Child extends Father{
	public int cmoney=100;
	public Child() {
		System.out.println("Child 생성자");
	}
}
public class Ex01_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		//child.pmoney; 상속관계여도 접근 불가
	}

}
