package sec01.ex01;

public class MethodEx1 {

	public static void main(String[] args) {
		MethodEx1 m = new MethodEx1();	// 메서드를 메모리에 생성한 후 참조 변수 m에 할당
		
		m.print();
		m.print();
		m.print();
		
	}
	
	public void print() {
		System.out.println("메서드 호출");
	}

}
