
public class Quiz {

	public static void main(String[] args) {
		int score = ((int)(Math.random()*10) +1)*100;

		String present = "";

		switch (score) {

		case 1000: {present += "TV, ";}

		case 900: {present += "NoteBook, ";}

		case 800: {present += "냉장고, ";}

		case 700: {present += "한우세트, ";}

		case 600: {present += "휴지"; break;}

		default: {present = "칫솔";} 

		}

		System.out.println("점수는 "+score+"입니다");

		System.out.println("경품은 " + present + "입니다");
	}
}