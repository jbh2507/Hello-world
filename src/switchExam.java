
public class switchExam {

	public static void main(String[] args) {
		// switch, case, default, break
		
		int value = 2;
		
		switch(value) {
		case 1:
			System.out.println("case 1");
		case 2:
			System.out.println("case 2");
		case 3:
			System.out.println("case 3");
			break; // break를 입력 안해주면 "case 4"도 출력
		case 4:
			System.out.println("case 4");
		default :
			System.out.println("default"); // 위 case 중 어느 것도 해당되지 않을 경우 default 실행
		}
		
		String str = "A"; // JDK 7부터는 switch 조건문에 문자열(str)도 가능해짐
		
		switch(str) {
		case "A":
			System.out.println("case A");
		case "B":
			System.out.println("case B");
		}
		
	}

}
