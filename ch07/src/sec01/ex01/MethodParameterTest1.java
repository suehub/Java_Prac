package sec01.ex01;

public class MethodParameterTest1 {

	public static void main(String[] args) {
		MethodParameterTest1 m = new MethodParameterTest1();
		
		m.print(5);
		m.print(11);
		
		m.printResult("Hello~");
		
		System.out.println("종료");

	}
	
	public void print(int x) {
		System.out.println("전달된 값: " + x);
	}
	
	public void printResult(String result) {
		System.out.println("result");
	}

}
