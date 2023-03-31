class Person{
	String name;
	int age;

	//만약 사람 만들 때 이름, 나이 강제하고 싶으면
	//Person(){}
	//Person(String name, int age) {this.name = name; this.age = age;}
	void print() {
		System.out.println(this.name + " : " + this.age);
	}

}
public class Ex04__Object_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] intarr = new int[10];
			boolean[] boolarr = new boolean[5]; //false (default)
			
			Person p = new Person(); //local 참조변수 p >> p라는 변수는 주소값을 갖는다
			p.name = "홍길동";
			p.age = 100;
			
			//Person 타입의 사람 3명을 만드세요
			//heap 메모리에 객체를 3개
			Person p2 = new Person();
			Person p3 = new Person();
			Person p4 = new Person();
			
			//int i, int j, int k
			Person[] persons = new Person[3];
			System.out.println(persons);
			System.out.println(persons[0]);
			System.out.println(persons[1]);
			System.out.println(persons[2]);
			
			//방이 비워져 있어요
			
			persons[0] = new Person(); //방은 주소값을 갖는다.
			
			Person p5 = new Person();
			persons[1] = p5;
			
			persons[2] = new Person();
			
			persons[2].name="오승환";
			persons[2].age=34;
			
			
			System.out.println(persons[2].name);
			System.out.println(persons[2].age);
			
			//초급자
			//객체 배열은 방을 만드는 것과 방을 채우는 작업은 별도다
			
			//객체 배열은 ... 1번 방 만들기 , 2번 방을 주소로 채우기!!!!
			
			//객체 배열 3가지 방법 ..
			
			//1. int[] arr = new int[10];
			Person[] parray = new Person[10]; //방만 만들었다.
			//parray[0] >> null이 있어요
			//방에 들어갈 주소도 만들어야합니다 (Person 타입과 동일)
			for(int i=0; i<parray.length; i++) {
				parray[i] = new Person();
				System.out.println("주소값" + parray[i]);
			}
			/*
			주소값Person@515f550a
			주소값Person@626b2d4a
			주소값Person@5e91993f
			주소값Person@1c4af82c
			주소값Person@379619aa
			주소값Person@cac736f
			주소값Person@5e265ba4
			주소값Person@156643d4
			주소값Person@123a439b
			주소값Person@7de26db8
			 */
			
		//2. int[] arr = new int{10,20,30}
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()};
			
		//3. int[] arr = {10,20,30}
		Person[] parray3 = {new Person(), new Person(), new Person()};
			
	}

}