package member;

public class MemberVO {
    String id;
    String name;
    String password;
    String address;
    String phoneNum;

    public MemberVO(String id, String name, String password, String address, String phoneNum) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    // getter와 setter는 생략

}
