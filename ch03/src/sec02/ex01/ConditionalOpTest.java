package sec02.ex01;
import java.util.Scanner;

public class ConditionalOpTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시험 점수를 입력해 주세요");
		String temp = sc.nextLine();
		
		int score = Integer.parseInt(temp);
		String result = ((0 <= score) && (score <= 100)) ? "바르게 입력했습니다." : "다시 입력해주세요.";
		
		System.out.println(result);

	}

}
