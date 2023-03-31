import kr.or.kosa.Car;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		
		//자동차 생산
		Car mycar = new Car();  // mycar는 함수 안에 지역변수라 스택에 저장
											 // Car변수는 힙에 저장
		mycar.setDoor(2);
		mycar.setCarColor("red");
		mycar.run();
		mycar.info();
	}

}