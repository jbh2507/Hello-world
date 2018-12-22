
public class arrayExam2 {

	public static void main(String[] args) {
		int[] iArray = new int[100];
		
		for(int i = 0; i < iArray.length; i++) {	// iArray.length = iArray의 저장가능 값의 수
			iArray[i] = i + 1;
		}	// 위 구문으로 iArray에는 1~100값이 차례대로 저장됨
		
		int sum = 0;	// sum을 아래 for 구문 안에서 선언하면 반복할 때 마다 계속 선언하기 때문에 누적시킬수 없음
		for(int i = 0; i < iArray.length; i++) {
			sum = sum + iArray[i];
		}
		
		System.out.println(sum);
	}

}
