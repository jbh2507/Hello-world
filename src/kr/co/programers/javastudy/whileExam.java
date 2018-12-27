package kr.co.programers.javastudy;
import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		int i = 10;
		final int FI = 1;
		Scanner scan = new Scanner(System.in); // scan은 키보드로 입력받음
		
		while(i != 10){
			// doWhile이 아니라 그냥 while로 작성 시 이미 조건을 false값을 받기 때문에 실행 X
			i = scan.nextInt(); // scan은 정수값을 입력받음
			System.out.println("입력: "+i);
		}
		
		do {
			// doWhile 사용 시 false를 받았지만 일단 최초 1회는 실행함
			i = scan.nextInt(); 
			System.out.println("do 1입력: "+i);
		}while(i != 10);
		
		System.out.println("입력 완료");
	}
}