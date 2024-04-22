package sec05.ex02;

import java.util.Scanner;

public class GCDTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자연수를 입력하세요.");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int gcd = 1;
		

		if (num1 > num2) { 
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i=1; i<=num1; i++) {
			if (num1%i==0 && num2%i==0) {
				System.out.println("공약수 : " + i);
				
				if (gcd < i) {
					gcd = i;
				}
			}
		}
		
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 = " + gcd);
		
		sc.close();
		

	}

}
