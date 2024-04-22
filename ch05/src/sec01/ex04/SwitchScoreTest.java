package sec01.ex04;

import java.util.Scanner;

public class SwitchScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력해주세요.");
		int score = sc.nextInt();
		
		
		switch(score/10) {
		case 9, 10 -> System.out.println("A학점입니다.");
		case 8 -> System.out.println("B학점입니다.");
		case 7 -> System.out.println("C학점입니다.");
		case 6 -> System.out.println("D학점입니다.");
		default -> System.out.println("F학점입니다.");
		}
		
		
		var message = switch (score/10) {
			case 9, 10 -> { yield "A학점입니다."; }
			case 8 -> "B학점입니다.";
			case 7 -> "C학점입니다.";
			case 6 -> "D학점입니다.";
			default -> "F학점입니다.";
		};
		
		System.out.println(message);
		
		switch(score/10) {
		case 10, 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7: 
			System.out.println("C학점입니다.");
			break;
		case 6: 
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
			break;
			
		}

	}

}
