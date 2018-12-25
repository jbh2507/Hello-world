
public class enumExam {

	public static void main(String[] args) {
		Gender gen;
		gen = Gender.MALE;
		gen = Gender.FEMAL;
		// gen = "FEMAL"; = 컴파일 에러, 위와 같은 형식으로만 값을 입력 가능
		// gen = "boy"; = 컴파일 에러
		
		System.out.println(gen);
		
	}

}
enum Gender{
	MALE,FEMAL;
}	// 열거형(enum)클래스 'Gender'선언 Gender로 선언된 것은 'MALE'과 'FEMAL' 값밖에 가질 수 없음