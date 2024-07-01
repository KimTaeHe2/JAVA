package ch08.extended.vehicle;

public class DriverExam {

	public static void main(String[] args) {
		// 운전자가 실행하는 코드
		
		Driver driver = new Driver(); // 운전자 서비스 객체
		
		Vehicle vehicle = new Vehicle(); // 탈것 부모 객체
		vehicle.name = "탈것";
		driver.driver(vehicle);
		
		Bus bus = new Bus();
		bus.name = "시내버스";
		bus.type = "전기형";
		bus.busCard();
		driver.driver(bus);

		Taxi taxi = new Taxi();
		taxi.model = "카카오택시";
		taxi.name = "가스형";
		taxi.meter();
		driver.driver(taxi);

	} // main 종료

} // class 종료
