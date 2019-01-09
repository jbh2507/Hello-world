package kr.co.programers.javastudy2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(sdf.format(date));
		// SimpleDateFormat을 인스턴스 선언한 뒤에 .format(); 메소드 초기값에 Date로 선언한 인스턴스를 넣어 사용
		
		System.out.println(date.getTime());
		// .getTime(); 현재 시간을 long타입으로 반환
		
		long today = System.currentTimeMillis();
		System.out.println(today);
		//  System.currentTimeMillis(); 현재 시간을 long값으로 반환
		
		System.out.println(today - date.getTime());
		// 시간 사이에도 연산자 사용 가능 (10행과 20행간에 수행시간을 알 수 있음)
	}

}
