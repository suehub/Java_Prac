package res;

public interface Reserve {
    public String checkResInfo(ResVO vo);
    public void regCar(ResVO vo);
    public void modResInfo(ResVO vo);
    public void cancelResInfo(ResVO vo);


}
