import kr.or.kosa.Tv;
public class Tv_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Tv tvclass = new Tv();
			int result5 = tvclass.chinfo();
			System.out.println(result5);
			String result6 = tvclass.brandinfo();
			System.out.println(result6);
			int result = tvclass.chplus(50);
			System.out.println(result);
			int result1 = tvclass.chminus(89);
			System.out.println(result1);
			
			String result3 = tvclass.info(50,"삼성" );
			System.out.println(result3);
			}
	}
