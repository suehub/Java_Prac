package sec02.ex02;

public class NestedForBreakTest {

	public static void main(String[] args) {
		Outter :	// label 
			for (int i=1; i<=5; i++) {
				for (int j=1; j<=5; j++) {
					if(j==3) 
						break Outter;
					
					System.out.println("i= " + i + ", j= " + j);
				}	// 내부 for문의 끝
				
				System.out.println();
			}	// 외부 for문의 끝
		
		System.out.println("프로그램 종료");

	}

}
