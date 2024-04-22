package sec04.ex01;
import java.util.Scanner;

public class RunningDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("일주일 동안 운동한 거리를 입력해주세요.");
		double total = 0;
		
		for (int i =0; i<7; i++) {
			total += sc.nextInt();
		}
		
		total = total / 7 * 0.3048;
		System.out.printf("평균 운동 거리는 %.2ffeet입니다.", total);

	}

}
