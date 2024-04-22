package sec05.ex03;

public class BinOctHexTest {

	public static void main(String[] args) {
		int num1 = 200;
		int bin = 0b11010011;
		int oct = 0110;
		int hex = 0x13FC;
		
		System.out.println("num = " + num1);
		System.out.println("bin = " + bin);
		System.out.println("oct = " + oct);
		System.out.println("hex = " + hex);
		System.out.println("num1 = " + Integer.toBinaryString(num1)); // 2진수
		System.out.println("bin = " + Integer.toOctalString(bin));   // 8진수
		System.out.println("oct = " + Integer.toHexString(oct)); 	// 16진수

	}

}
