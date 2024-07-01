package ch06.calender;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		// Calendar 객체를 이용해서 날짜를 처리함
		
		Calendar cal = Calendar.getInstance();
		// .getInstance(); 내장된 객체를 가져옴 new 사용 안함
		int year = cal.get(Calendar.YEAR);
		// get 메서드는 객체의 값을 가져오는 동작
		// Calendar.YEAR = 매개앖으로 년도를 신청함.
		System.out.println("현재 년도 : " + year);
		
		int month = cal.get(Calendar.MONTH)+1;
		// Calendar.MONTH는 0부터 시작하기 때문에 +1 필수다
		System.out.println("현재 월 : " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		// Calendar.DAY_OF_MONTH 월에 해당하는 일자를 가져온다
		System.out.println("현재 일 : " + day);
		
		
		Week today = null;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// Calendar.DAY_OF_WEEK 요일이 숫자로 반환됨 일요일 = 1 switch문으로 요일 고정
		switch(week) { // 요일 숫자로 받은 값을 변환
		case 1:
			today = Week.SUNDAY; // 일요일
			System.out.println("현재 요일 : " + week);
			break;
		case 2:
			today = Week.MONDAY; // 월요일
			System.out.println("현재 요일 : " + week);
			break;
		case 3:
			today = Week.TUESUDAY; // 화요일
			System.out.println("현재 요일 : " + week);
			break;
		case 4:
			today = Week.WEDNESDAY; // 수요일
			System.out.println("현재 요일 : " + week);
			break;
		case 5:
			today = Week.THURSDAY; // 목요일
			System.out.println("현재 요일 : " + week);
			break;
		case 6:
			today = Week.FRIDAY; // 금요일
			System.out.println("현재 요일 : " + week);
			break;
		case 7:
			today = Week.SATURDAY; // 토요일
			System.out.println("현재 요일 : " + week);
			break;
			
			default:
				System.out.println("버그 생성 : 작성자에게 문의하세요");
		}
		
		int hour = cal.get(Calendar.HOUR);
		// Calendar.HOUR 현재 시간의 값을 가져옴
		System.out.println("현재시간 : " + hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 분 : " + minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 초 : " + second);
		
	} // main 종료

} // class 종료
