import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		System.out.println("광희형은 몇년생인가?");
		
		do {
		 i = scan.nextInt();
		 if(i!=91) System.out.println("땡!");
		}while(i != 91);
	
		System.out.println("정답!");
	}
}