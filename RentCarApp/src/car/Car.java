package car;

import common.Base;

public class Car extends Base {
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

}
