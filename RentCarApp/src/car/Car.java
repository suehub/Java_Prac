package car;

import common.AbstractBase;

import java.util.Calendar;

public class Car extends AbstractBase {
	String carNumber;
	String carName;
	String carColor;
	int carSize;
	String carMaker;
	
	public Car() {}
	
	public Car(String carNumber, String carName, String carColor, int carSize, String carMaker) {
		this.carNumber = carNumber;
		this.carName = carName;
		this.carColor = carColor;
		this.carSize = carSize;
		this.carMaker = carMaker;
	}
	
	// 차 정보 조회
	public String checkCarInfo() {
		System.out.println("\n렌터카 정보를 조회합니다.");
		System.out.println("------------------------");
		String carInfo = "차 번호: " + carNumber + "\n차 이름: " + carName + "\n차 색상: " + carColor + "\n차 크기: " + carSize + "cc" + "\n제조사: " + carMaker;
		
		return carInfo;
	}
	
	// 차 정보 등록
	public void regCarInfo(String carNumber, String carName, String carColor, int carSize, String carMaker) {
		System.out.println("차 정보를 등록합니다.");
		this.carNumber = carNumber;
		this.carName = carName;
		this.carColor = carColor;
		this.carSize = carSize;
		this.carMaker = carMaker;
	}
	
	// 차 정보 수정
	public void modCarInfo() {
		System.out.println("\n렌터카 정보를 수정합니다.");
	}
	
	// 차 정보 삭제
	public void delCarInfo() {
		System.out.println("\n렌터카 정보를 삭제합니다.");
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
