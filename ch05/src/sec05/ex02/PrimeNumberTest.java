package sec05.ex02;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i=1; i<=num; i++) {
			if (num % i == 0) 
				cnt++;
		}
		
		System.out.println("num = " + num);
		
		if (cnt == 2) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 합성수입니다.");
		}
		

	}

}
