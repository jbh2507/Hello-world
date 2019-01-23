package kr.co.programers.javastudy;

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
		
		int[] array4 = new int[4];
		
		System.out.println(array4[0]);
		// 값이 지정되지 않은 int 배열 슬롯은 0을 반환한다. (str과 같은 객체타입의 배열은 null을 반환)
		
		System.out.println("array1 length: "+array1.length);
		// .length를 사용하여 배열의 크기를 정수로 반환할 수 있다. (입력된 값의 수가 아니라 입력되지 않은 빈칸의 수까지 합한 배열의 크기)
		
		// 배열은 기본 데이터 타입이 아니라 참조형 타입임
	}

}