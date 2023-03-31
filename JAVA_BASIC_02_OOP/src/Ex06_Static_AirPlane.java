import kr.or.kosa.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		/*
		AirPlane air1 = new AirPlane();
		air1.makeAirPlane(101, "대한항공");
		
		AirPlane air2 = new AirPlane();
		air2.makeAirPlane(102, "아시아나");
		air2.airPlaneTotalCount();

		//AirPlane. airtotalcount static private 접근불가(간접)
		//air1.airtotalcount 도 접근불가
		 */
		
		AirPlane air1 = new AirPlane("대한항공", 101);
		air1.airDisplay();
		air1.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane("아시아나", 707);
		air1.airDisplay();
		air1.airPlaneTotalCount();
	}

}
