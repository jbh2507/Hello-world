package kr.co.programers.javastudy2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JavaTimePackage {
	
	public static void main(String[] args) {
		LocalDateTime timepoint = LocalDateTime.now(); 
		// LocalDateTime.now(); 현재 날짜와 시간을 가져오는 메소드
		System.out.println(timepoint);
		
		LocalDate dateloc = LocalDate.of(2035, Month.APRIL, 12);
		System.out.println(dateloc);
		
		LocalTime lt = LocalTime.of(14, 18);
		System.out.println(lt);
		
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timepoint.toLocalDate();
		System.out.println(theDate);
		
		System.out.println(timepoint.getMonthValue());
		
		Month mon = timepoint.getMonth();
		System.out.println(mon.getValue());
		// 27행과 30행은 같은 결과를 출력한다.
	}
}
