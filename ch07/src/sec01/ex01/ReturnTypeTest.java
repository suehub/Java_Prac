package sec01.ex01;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		int a1 = 10;
		int a2 = 20;
		double d1 = 1.5;
		double d2 = 3.6;
		
		ReturnTypeTest m = new ReturnTypeTest();
		int result1 = m.addInt(a1, a2);
		double result2 = m.multipy(d1, d2);
		
		System.out.println(result1 + " " + result2);

	}
	
	public int addInt(int x, int y) {
		int result = x + y;
		
		return result;
	}
	
	public double multipy(double x, double y) {
		double result = x * y;
		
		return x;
	}

}
