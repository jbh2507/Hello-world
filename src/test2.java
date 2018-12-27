import java.util.Scanner;

import kr.co.programers.javastudy.*;	// kr.co....의 클래스를 사용할 수 있도록 함

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