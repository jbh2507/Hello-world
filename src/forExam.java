
public class forExam {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 1; i <= 100; i++) {
			// for(A; B; C) = A는 최초 1회 실행(초기값 주는데 이용)
			// B는 조건문
			// C는 증감부 {}안에 실행부를 실행한 뒤 실행
			
			if(1%2 != 0) {
				continue;
			} // continue 입력 시 해당 부분 실행하고 아래 구문은 수행하지 않고 증감부로 바로 감 
			
			total = total + i;
			
			if(i == 50) {
				break;
			} // break 수행시 반복 구문 정지
			
		}
		
		System.out.println(total);
	}
}
