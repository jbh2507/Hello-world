
public class test {
	public static void main(String[] args) {
		final int NOVEL_PRICE = 10000;
		final int BUGET = 50000;
		int count = 10;
		int totalPrice =  count * NOVEL_PRICE;
		
		while(totalPrice > BUGET) {
			totalPrice =  --count * NOVEL_PRICE;
		}
		                         
		System.out.println("당신은 소설책을 "+count+"권 살 수 있습니다.");
	}
}
