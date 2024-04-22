package res;

public class Reserve {

	String resNumber;
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String useEndDate;
	
	public Reserve() {}
	
	public Reserve(String resNumber, String resCarNumber, String resDate, String useBeginDate, String useEndDate) {
		this.resNumber = resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.useEndDate = useEndDate;
		
	}
	
	// 차 예약 정보 조회 기능 
	public String checkResInfo() {
		System.out.println("\n차 예약 정보를 조회합니다.");
		System.out.println("-------------------------");
		String resInfo = "에약 번호: " + resNumber + "\n예약 차 번호: " + resCarNumber + "\n예약 일자: " + resDate + "\n차 사용 시작 일자: " + useBeginDate + "\n차 반납 예정 일자: " + useEndDate;
		
		return resInfo;
	}
	
	// 차 예약 기능
	public void resCar(String resNumber, String resCarNumber, String resDate, String useBeginDate, String useEndDate) {
		System.out.println("차 예약 정보를 등록합니다.");
		this.resNumber = resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.useEndDate = useEndDate;
	}
	
	// 차 예약 정보 수정 기능 
	public void modResInfo() {
		System.out.println("\n차 예약 정보를 수정합니다.");
	}

	// 차 예약 정보 취소 기능
	public void cancelResInfo() {
		System.out.println("\n차 예약을 취소합니다.");
	}
}
