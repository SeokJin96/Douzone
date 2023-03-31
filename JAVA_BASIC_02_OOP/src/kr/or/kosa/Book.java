package kr.or.kosa;
/*
 	책은 책이름과 가격정보를 가지고 있다
 	책이 출판되면 반드시 책이름과 책 가격정보를 가지고 있어야 한다
 	책의 이름과 가격정보는 특정 기능을 통해서만 볼 수 있고, 출판된 이후에는 수정할 수 없다 (책의 가격, 이름)
 	책 이름과 가격 정보는 각각 확인할 수 있다.
 */
public class Book {
	private String bookname;
	private int bookprice;
	
	public Book(String name, int price) {
		bookname = name;
		bookprice = price;
	}
	
	public String getBookname() {
		return bookname;
	}
	
	public int getBookprice() {
		return bookprice;
	}	
	
	public void Bookinfo() {
		System.out.println("책이름과 가격정보" +  bookname + bookprice);
	}
	
	
}
