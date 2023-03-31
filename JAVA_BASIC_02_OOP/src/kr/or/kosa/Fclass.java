package kr.or.kosa;
/*
 	기능(행위) 만드는 방법
 	method 만드는 방법(문법)
 	
 	method : 행위 또는 기능의 최소단위 구현 : 하나의 함수는 하나의 기능만 구현
 	ex) 먹는 기능, 자는 기능 1개씩만!
 	ex) 롯데월드 : 게임방 : 동전 (농구), 동전 뽑기(포켓몬)
 	
 	** 모든 함수는 호출에 의해서만 동작한다 **
 	*누군가 이름을 부르지 않으면 동작하지 않는다
 	
 	JAVA)
 	1. void, parameter(0) : public void print(String str){실행구문}
 	2. void, parameter(X) : public void print() {실행구문} 공짜
 	3. return type(0), parameter(0) : public int print(int data) {return 100;}
 	4. return type(0), parameter(X) : public int print() {return 100;}
 	
 	void > 돌려주는 것이 없어요 > return type 없어요
 	return type >> 8가지 기본 + 1(String), Array, class, interface, collection
 	이 중에서 8가지 + String + class만 일단 학습

 	public boolean print(){return type;}
 	Car print() {  return Car주소값  }
 	Car print() {  return new Car();  }
 	Car print() { Car car = new Car(); return car;} 
 	목표 : 위 3줄 자유롭게 갖고놀기
 	
 	String print() {return "AAAA";} // return값으로 문자열 아무거나! String이니까
 	
 	parameter type >> void print(String 변수)
 	parameter type >> 8가지 기본 + 1(String), Array, class, interface, collection
 	
 	void print(int i){	} >> 호출 print(100);
 	void print(String str) {} >> 호출 print("AAA");
 	void print(Car c) {} >> 호출 >> Car c1 = new Car() print(c1); and print(new Car());
 	
 	void print(int a, int b, int c){}//나는 무조건 실행할 때 3개의 parameter를 받겠다(강제)
 		print2(10); (x)
 		print2(10,20); (x)
 		print2(10,20,"30"); (x)
 		print2(1,2,3,) (O)
 	
 		함수의 이름 : 관용적
 		class Car, class Person
 		
 		메서드 : getNumber();
 		
 		사원테이블에서 사원의 번호를 가지고 사원의 모든 정보를 가지고 오는 함수를 만들어라
 		
 		void getEmpListByEmpno(int empno)
 */
public class Fclass {
	public int data;
	
	//void m() >> 컴파일러가 >> default void m() >> 같은 폴더(package)내에서만 사용
	//함수의 접근자(수정자) : 70% public
	//함수의 30% private : class 내부에서는 public, private 의미가 없어요 다 같은 식구일뿐
	
	//클래스 내부에서만 사용하라 >> 이럼 함수 >> 다른 함수를 [도와주는 함수] (공동함수)
	
	public void m() {		//void parameter (x)
		//기능 구현
		System.out.println("일반함수 : void, parameter(x)");		
	}
	
	public void m2(int i) {
		System.out.println("일반함수 : void, parameter(0)");
		System.out.println("parameter 값을 활용 : " + i);
	}
	
	public int m3() {
		//강제로 return 구현
		return 10000;
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	
	//여기까지가 기본적인 함수 4가지
	//확장
	
	//return type(0), parameter (0) 개수 ...
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//함수의 접근자(수정자) 한정자
	//int sum(); >> 컴파일러가 >> default int sum();
	//private int sum() >> 객체입장에서는 접근 불가 >>같은 클래스 안에서 접근 가능
	// 클래스 내부에서 다른 함수를 도와주는 공통함수
	
	private int subSum(int i) {
		return i + 100;
		
	}
	
	//Fclass fclass = new Fclass();
	//fclass. 보이지 않는다
	
	public void callSubSum() {
		int result = subSum(100); //private 함수
		System.out.println("call result : " + result);
	}
	
	public int opSum(int data) {
		int result = subSum(data);
		//제어
		if(result > 0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	//Quiz
	/*
	 함수를 생성하는데
	 정수타입의 parameter 2개를 받아서 둘 중에 큰 값을 리턴하는 함수를 만드세요
	 ex) max(10, 5) return 10이 반환되면 됨
	 */
	
	public int max(int a, int  b) {
		return  (a>b) ?a : b;
	}
}
