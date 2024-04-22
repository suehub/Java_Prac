package sec01.ex02;

import java.util.Scanner;

public class HeightArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 정보를 입력해주세요.");
		
		float sum = 0;
		float[] heights = new float[5];
		
		for(int i=0; i<heights.length; i++) {
			heights[i] = sc.nextFloat();
			sum += heights[i];
		}
		
		System.out.println(sum / heights.length);
		

	}

}
