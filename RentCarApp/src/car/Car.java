package car;

import common.AbstractBase;
import common.DataUtil;

import java.util.Calendar;

public class Car extends AbstractBase {
	String carData;
	
	public Car() {}

	// 차 정보 조회
	public String checkCarInfo(CarVO vo) {
		carData="차번호:" + vo.carNumber+","+
				"\n차이름:" + vo.carName+","+
				"\n차크기:" + vo.carSize+","+
				"\n차색상:" + vo.carColor+","+
				"\n제조사:" + vo.carMaker;
		DataUtil.decodeData(carData);

		System.out.println("\n렌트카 정보를 조회합니다.");
		System.out.println("렌트카 조회 시간 :"+showTime());

		return carData;
	}

	//차 정보 등록
	public void regCarInfo(CarVO vo) {
		carData= vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carMaker;

		DataUtil.encodeData(carData);

		System.out.println("\n차 정보를 등록합니다.");
		System.out.println("렌트카 등록 시간 :"+showTime());

	}

	// 차 정보 수정
	public void modCarInfo(CarVO vo) {
		System.out.println("\n렌트카 정보를 수정합니다.");
		System.out.println("렌트카 정보 수정시간 :" + showTime());

		carData= vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carMaker;

		DataUtil.encodeData(carData);
	}

	//차 정보 삭제
	public void delCarInfo(CarVO vo) {
		System.out.println("\n렌트카 정보를 삭제합니다.");
		System.out.println("렌트카 정보 삭제 시간 :" + showTime());

		carData= vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carMaker;

		DataUtil.decodeData(carData);
	}

	@Override
	public void displayData(String data) {
		System.out.println("조회한 차 데이터는 " + data + "입니다.");
	}

	@Override
	public String showTime() {
		String date = null;
		String time = null;

		Calendar cal = Calendar.getInstance(); // Calendar 인스턴스 얻음
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		date = year + "-" + month + "-" + day;
		time = hour + ":" + minute + ":" + second;

		return date + " " + time;
	}
}
