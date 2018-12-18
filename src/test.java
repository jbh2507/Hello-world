
public class test {
	public static void main(String[] args) {
		final int NOVEL_PRICE = 10000;
		final int BUGET = 50000;
		int count = 10;
		int totalPrice =  count * NOVEL_PRICE;
		if (totalPrice > BUGET) count = count - 1;
		totalPrice =  count * NOVEL_PRICE;
		System.out.println(totalPrice);
	}
}
