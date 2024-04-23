package member;

import car.Car;
import common.AbstractBase;
import common.DataUtil;

import java.util.Calendar;

public class Member extends AbstractBase {

	String memberData;
	
	// 생성자
	public Member () {}
	
	// 회원 정보 조회
	public String viewMemter(MemberVO vo) {
		DataUtil.decodeData(memberData);
		memberData = "회원 아이디: " + vo.id + ",\n회원 비밀번호: " + vo.password + ",\n회원 이름: " + vo.name + ",\n회원 전화번호: " + vo.phoneNum;

		System.out.println("회원 정보를 조회합니다.");
		System.out.println("회원 조회 시간: " + showTime());

		return memberData;
	}

	// 새로운 회원 등록
	public void regMember(MemberVO vo) {
		memberData = vo.id + "," + vo.name + "," + vo.password + "," + vo.phoneNum;

		DataUtil.encodeData(memberData);	// 회원 정보 등록 전 암호화

		System.out.println("\n회원가입 합니다");
		System.out.println("회원 가입 시간: " + showTime());

	}
	
	// 기존 회원 정보 수정
	public void modMember(MemberVO vo) {
		memberData = vo.id + "," + vo.name + "," + vo.password + "," + vo.phoneNum;
		DataUtil.encodeData(memberData);	// 수정한 회원 정보 암호화

		System.out.println("\n회원 정보를 수정합니다");
		System.out.println("회원 수정 시간: " + showTime());
	}
	
	// 기존 회원 정보 삭제
	public void delMember(MemberVO vo) {
		memberData = vo.id + "," + vo.name + "," + vo.password + "," + vo.phoneNum;
		DataUtil.decodeData(memberData);	// 삭제하기 전 회원 정보 복호화

		System.out.println("\n회원 정보를 삭제합니다.");
		System.out.println("회원 삭제 시간: " + showTime());

	}

	@Override
	public void displayData(String data) {
		System.out.println("조회한 회원 데이터는 " + data + "입니다.");
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


