package sec02.ex02;

public class WhileCelFahConversionTest {

	public static void main(String[] args) {
		final int BASE = 32;
		float celsius = 0.0F;
		int fahrenheit = 0;
		
		while (fahrenheit <= 100) {
			celsius = (fahrenheit - BASE) * ( 5.0F / 9.0F);
			System.out.printf("화씨 : %d\t 섭씨 : %.3f\n", fahrenheit, celsius);
			fahrenheit += 10;
		}

	}

}
