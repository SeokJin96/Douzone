
public class Ex09_Static_Method {

		
		void method() {
			System.out.println("나 일반함수야");
		}
		
		static void smethod() {
			System.out.println("나 static함수야");
		}
	
	public static void main(String[] args) {
		// Ex09_Static_Method.smethod();
		smethod();
		
		Ex09_Static_Method sc = new Ex09_Static_Method();
		sc.method();
		sc.smethod(); //호출가능
		

	}

}
