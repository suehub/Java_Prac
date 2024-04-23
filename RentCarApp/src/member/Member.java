package member;

public interface Member {
    public String viewMember(MemberVO vo);
    public void regMember(MemberVO vo);
    public void modMember(MemberVO vo);
    public void delMember(MemberVO vo);
}
