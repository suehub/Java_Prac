package main;

import car.Car;
import member.Member;
import res.Reserve;

public class RentCarApp {

	public static void main(String[] args) {
		// 회원, 차, 예약 인스턴스 생성
		Member member = new Member();
		Car car = new Car();
		Reserve reserve = new Reserve();
		
		
		// 회원, 차, 예약 등록
		member.regMember("lee", "1234", "이순신", "경기도 고양시", "010-1111-2222");
		car.regCarInfo("11가 1111", "소나타", "검정", 200, "현대");
		reserve.resCar("20220707-0001", "11가 1111", "2022-04-30", "2022-05-01", "2022-05-08");
		
		// 회원 정보 조회
		String memberInfo = member.viewMember();
		System.out.println(memberInfo);
		
		// 렌터카 정보 조회
		String carInfo = car.checkCarInfo();
		System.out.println(carInfo);
		
		//예약 정보 조회
		String resInfo = reserve.checkResInfo();
		System.out.println(resInfo);
		
		

	}

}
