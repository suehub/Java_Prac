package sec04.ex01;
import java.util.Scanner;

public class DigitSumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 자리 정수를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		
		sum += num / 100;
		sum += num % 100 / 10;
		sum += num % 10;
		
//		int sum = num / 100;
//		
//		num %= 100;
//		sum += num / 10;
//		num %= 10;
//		sum += num;
		
		System.out.println("자릿수의 합은 " + sum + "입니다.");
		
		
	}

}
