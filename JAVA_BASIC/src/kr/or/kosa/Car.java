package kr.or.kosa;

// class == 설계도 == 타입  <- 암기
public class Car {
	private int door;
	private String carColor;
	
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public void run() {
		System.out.println("달린다");
	}
	public void stop() {
		System.out.println("멈춘다");
	}
	public void info() {
		System.out.print("창문은 " + door + "개고 ");
		System.out.println("차의 색은" + carColor + "색입니다.");
	}
}
