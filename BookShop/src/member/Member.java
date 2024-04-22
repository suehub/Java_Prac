package member;

public class Member {
    String id;
    String password;
    String name;
    String address;
    String phoneNum;

    public Member() {}

    public Member(String id, String password, String name, String address, String phoneNum) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    // 회원 정보 조회
    public String printUserInfo () {
        String info = id + " " + password + " " + name + " " + address + " " + phoneNum;

        return info;
    }

    // 회원 정보 등록
    public void createUser () {

    }

    // 회원 정보 수정
    public void updateUser () {

    }


    // 회원 정보 삭제
    public void deleteUser () {

    }

}
