package sec01.ex01;

public class ArrayUseTest {

	public static void main(String[] args) {
		int[] score = new int[5];
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int[] score2 = new int[] {50, 60, 70,80, 90};
		int[] score3 = {50, 60, 70, 80, 90};
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}

	}

}
