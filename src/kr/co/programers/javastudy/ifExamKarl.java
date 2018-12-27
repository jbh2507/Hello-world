package kr.co.programers.javastudy;

public class ifExamKarl {

	public static void main(String[] args) {
		int i=5;
		int j=10;

		final String msg_equal = "%s는 %s와 같습니다";
		final String msg_not_equal = "%s는 %s와 같지 않습니다. 그리고";
		final String msg_diff = "%s가 %s보다 %d만큼 작습니다.";

		if(i==j){
		    System.out.println(String.format(msg_equal,"i","j"));
		} else {
		    System.out.println(String.format(msg_not_equal,"i","j"));
		    System.out.println(String.format(msg_diff,(i<j?"i":"j"),(i<j?"j":"i"),(i<j?j-i:i-j)));
		    										// (i<j?"i":"j") = i가 j보다 작은가? true라면 i false라면 J
		}


	}

}
