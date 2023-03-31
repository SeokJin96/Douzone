class Product{
	int price;
	int point;
	
	Product(int price){
		this.price=price;
		this.point=(int)(price/10);
	}
}
	class Tv extends Product{
		Tv(){
			super(100);
		}

		@Override
		public String toString() {
			return "TV";
		}
	}
	
	class Notebook extends Product{
		Notebook(){
			super(100);
		}

		@Override
		public String toString() {
			return "Notebook";
		}
	}
	
	class Audio extends Product{
		Audio(){
			super(100);
		}

		@Override
		public String toString() {
			return "Audio";
		}
	}
	

class Buyer{
	int money=5000;
	int point;
	Product cart[];
	int index = 0;
	
	Buyer() {
		this(1000,0);
	}
	
	Buyer(int money, int point){
		cart = new Product[10];
		this.money=money;
		this.point=point;
	}
	
	void Buy(Product n) {
		if(this.money < n.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		if(this.index >= 10) {
			System.out.println("카트 꽉참");
			return;
		}
		
		cart[index++] = n;
		
		this.money -= n.price;
		this.point += point;
		System.out.println("잔액 : "+this.money);
		System.out.println("구매한 물건 : " + n.toString());
	}
	
	void summary() {
		int totalprice=0;
		int totalpoint=0;
		String productlist = "";
		
		for(int i=0; i<index; i++) {
			totalprice += cart[i].price;
			totalpoint += cart[i].point;
			productlist += cart[i].toString() + " ";
		}
		
		System.out.println("***************");
		System.out.println("구매한 총액 : " + totalprice);
		System.out.println("총 포인트 : " + totalpoint);
		System.out.println("구매한 목록 : " + productlist);
	}
}



public class KeyPoint {

	public static void main(String[] args) {
			Tv tv = new Tv();
			Notebook notebook = new Notebook();
			Audio audio = new Audio();
			
			Buyer buyer = new Buyer(5000,0);
			
			buyer.Buy(notebook);
			buyer.Buy(notebook);
			buyer.Buy(tv);
			buyer.Buy(tv);
			buyer.Buy(audio);
			buyer.summary();
			
	}

}
