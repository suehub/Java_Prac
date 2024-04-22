package sec06.ex01;
import java.util.Scanner;

public class ScoreAve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int chemical = sc.nextInt();
		
		int sum = kor + eng + math + chemical;
		float ave = sum/4;
		
		System.out.printf("총점은 %d, 평균은 %.2f", sum, ave);

	}

}
