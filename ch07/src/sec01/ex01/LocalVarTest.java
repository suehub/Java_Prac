package sec01.ex01;

public class LocalVarTest {

	public static void main(String[] args) {
		LocalVarTest m = new LocalVarTest();
		
		m.printSumFrom1To100();
		
		System.out.println("종료");

	}
	
	public void printSumFrom1To100() {
		int sum = 0;
		for (int i=0; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1에서 100까지의 합 : " + sum);
		
	}

}
