package sec04.ex01;
import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int num = sc.nextInt();
		
		String result = num%2 == 0 ? "짝수" : "홀수";
		System.out.println(num + "은 " + result);
		
		
	}

}
