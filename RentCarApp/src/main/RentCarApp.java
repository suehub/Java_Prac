package main;

import car.CarImpl;
import car.CarVO;
import member.MemberImpl;
import member.MemberVO;
import res.ResVO;
import res.ReserveImpl;

public class RentCarApp {

	public static void main(String[] args) {
		String memData;
		String carData;
		String resData;

		System.out.println("---------------------------------------------------");
		MemberVO memberVO = new MemberVO("lee", "1234", "이순신", "경기도 고양시", "010-1111-2222");
		MemberImpl member = new MemberImpl();
		member.regMember(memberVO);				// 회원 가입
		memData = member.viewMember(memberVO);	// 회원 정보 조회
		member.displayData(memData);
		System.out.println("--------------------------------------------------");

		CarVO carVO = new CarVO("11가 1111", "소나타", "검정", 200, "현대");
		CarImpl car = new CarImpl();
		car.regCarInfo(carVO);
		carData = car.checkCarInfo(carVO);
		car.displayData(carData);
		System.out.println("-------------------------------------------------");

		ResVO resVO = new ResVO("20220707-0001", "11가 1111", "2022-04-30", "2022-05-01", "2022-05-08");
		ReserveImpl reserve = new ReserveImpl();
		reserve.regCar(resVO);
		resData = reserve.checkResInfo(resVO);
		reserve.displayData(resData);

	}

}
