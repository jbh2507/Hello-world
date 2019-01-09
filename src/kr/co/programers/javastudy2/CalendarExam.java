package kr.co.programers.javastudy2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {
	
	public static void main(String[] args) {
		Calendar calen = Calendar.getInstance();
		// Calendar calen = new GregorianCalendar(); 도 사용 가능하지만
		// 이후 표준 달력 규격이 달라질 때를 대비하여 자바 내에서는 달력 형식을 구현하는 메소드를 만들어놨음
		// (이후에 해당 메소드만 수정하면 이용자들은 계속 기존 코드를 사용할 수 있도록)
		
		System.out.println(calen.get(Calendar.YEAR));
		System.out.println(calen.get(Calendar.MONTH)+1);	// 0~11로 표기되기때문에 +1해줘야댐
		System.out.println(calen.get(Calendar.DATE));
		
		System.out.println(calen.get(Calendar.HOUR));		// 12단위 표기법
		System.out.println(calen.get(Calendar.HOUR_OF_DAY));// 24단위 표기법
		
		calen.add(Calendar.HOUR, 5); // .add(field, amount);, 현재 시간에서 5시간을 더한 값을 출력
		
		System.out.println(calen.get(Calendar.HOUR));
	}
}
