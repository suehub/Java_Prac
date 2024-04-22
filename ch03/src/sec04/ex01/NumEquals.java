package sec04.ex01;
import java.util.Scanner;

public class NumEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 자리 정수를 입력하세요.");
		int num = 0;
		num = sc.nextInt();
		
		int num_h=0, num_t=0, num_o=0;
		num_h = num / 100;
		num_t = num % 100 / 10;
		num_o = num % 10;
		String result = (num_h == num_t && num_t == num_o) ? "모든 자리의 수가 일치합니다." : "모든 자리의 수가 일치하지 않습니다.";
		System.out.println(result);
	}

}
