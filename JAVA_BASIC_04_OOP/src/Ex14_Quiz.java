class Ssystem{
	
	public static final print out;
	static {
		out = new print();
	}
	
}

class print{
	void add(int i) {System.out.println(i);}
	void add(String s) {System.out.println(s);}
}

public class Ex14_Quiz {

	public static void main(String[] args) {
		System.out.println("이건 어떻게 구현된 함수일까요");
		
		Ssystem.out.add("111");
		//System
		//out
		//println
		//을 구현해 보세요
		//public static final PrintStream out;
		//static{out = new Printstream();}
		
		
	}

}
