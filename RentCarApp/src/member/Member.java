package member;

public interface Member {
    public String viewMember(MemberVO vo) throws MemberException;
    public void regMember(MemberVO vo) throws MemberException;
    public void modMember(MemberVO vo) throws MemberException;
    public void delMember(MemberVO vo) throws MemberException;
}
