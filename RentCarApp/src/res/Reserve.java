package res;

import common.AbstractBase;
import common.DataUtil;

import java.util.Calendar;

public class Reserve extends AbstractBase {

	String resData;
	
	public Reserve() {}


	// 차 예약 정보 조회 기능
	public String  checkResInfo(ResVO vo) {
		resData="예약 번호: " + vo.resNumber +", " +
				"\n예약 차번호: " + vo.resCarNumber+","+
				"\n예약 날자: " + vo.resDate+","+
				"\n이용 시작 일자: " + vo.useBeginDate+","+
				"\n차 반납 일자: " + vo.returnDate;
		DataUtil.decodeData(resData);

		System.out.println("\n차 예약 정보를 조회합니다.");
		System.out.println("렌트카 정보 조회 시간 :"+showTime());
		System.out.println("-------------------------");


		return resData;
	}

	// 차 예약 기능
	public void resCar(ResVO vo) {
		resData = vo.resNumber+","+
				vo.resCarNumber+","+
				vo.resDate+","+
				vo.useBeginDate+","+
				vo.returnDate;

		DataUtil.encodeData(resData);

		System.out.println("\n렌터카를 예약합니다.");
		System.out.println("렌트카 예약 시간 :"+showTime());


	}

	// 차 예약정보 수정 기능
	public void modResInfo(ResVO vo) {
		System.out.println("\n차 예약정보를 수정합니다.");
		System.out.println("렌트카 예약정보 수정시간 :" + showTime());

		resData="예약 번호: " + vo.resNumber +", " +
				"\n예약 차번호: " + vo.resCarNumber+","+
				"\n예약 날자: " + vo.resDate+","+
				"\n이용 시작 일자: " + vo.useBeginDate+","+
				"\n차 반납 일자: " + vo.returnDate;
		DataUtil.encodeData(resData);
	}

	// 차 예약 정보 취소 기능
	public void cancelResInfo(ResVO vo) {
		System.out.println("\n차 예약을 취소합니다.");
		System.out.println("렌트카 예약정보 삭제 시간 :"+showTime());

		resData="예약 번호: " + vo.resNumber +", " +
				"\n예약 차번호: " + vo.resCarNumber+","+
				"\n예약 날자: " + vo.resDate+","+
				"\n이용 시작 일자: " + vo.useBeginDate+","+
				"\n차 반납 일자: " + vo.returnDate;
		DataUtil.decodeData(resData);
	}

	@Override
	public void displayData(String data) {
		System.out.println("조회한 예약 데이터는 " + data + "입니다.");
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
