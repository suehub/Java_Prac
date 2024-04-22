package sec05.ex02;

import java.util.Scanner;

public class DigitSumOfNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		int num = sc.nextInt();
		
		int mok = 0, remainder = 0;
		
		mok = num;
		
		do {
			remainder += mok % 10;
			mok /= 10;
			
		} while (mok != 0);
		
		System.out.println(num + "의 자릿수의 합은 " + remainder);
		
		sc.close();

	}

}
