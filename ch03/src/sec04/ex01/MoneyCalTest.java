package sec04.ex01;
import java.util.Scanner;

public class MoneyCalTest {
	// 167,730
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력해주세요.");
		
		int money = sc.nextInt();
		int cnt5Man=0, cntMan=0, cnt5Cheon=0, cntCheon=0, cnt5Baek=0, cntBaek=0, cntShip=0;
		
		cnt5Man = money / 50000;
		money -= cnt5Man * 50000;
		cntMan = money / 10000;
		money -= cntMan * 10000;
		cnt5Cheon = money / 5000;
		money -= cnt5Cheon * 5000;
		cntCheon = money / 1000;
		money -= cntCheon * 1000;
		cnt5Baek = money / 500;
		money -= cnt5Baek * 500;
		cntBaek = money / 100;
		money -= cntBaek * 100;
		cntShip = money / 10;
		
		System.out.println("오만원권은 " + cnt5Man + "장, 만원권은 " + cntMan + "장, 오천원권은 " + cnt5Cheon + "장, 천원권은 " + cntCheon + "장, 오백원은 " + cnt5Baek + "개, 백원은 " + cntBaek + "개, 십원은 " + cntShip + "개 입니다.");
		
		
	
		

	}

}
