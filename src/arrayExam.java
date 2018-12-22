
public class arrayExam {

	public static void main(String[] args) {
		int[] array1 = new int[4]; // 4개의 정수 값을 저장할 수 있는 배열 'array1' 생성
		
		array1[0] = 1; // array1의 0번째에 50의 리터럴 저장 (100개의 값이면 0~99 이용 가능)
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		int[] array2 = new int[] {1,2,3,4};
		int[] array3 = {1,2,3,4}; // array1,2,3은 모두 같은 값을 지님 같은 내용 다른 입력법
		
		System.out.println(array1[0]);
		System.out.println(array2[1]);
		System.out.println(array3[2]); 
		
		int value = array1[2];
		
		System.out.println(value);
		
		// 배열은 기본 데이터 타입이 아니라 참조형 타입임
	}

}