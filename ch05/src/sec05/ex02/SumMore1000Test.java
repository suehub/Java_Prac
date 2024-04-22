package sec05.ex02;

public class SumMore1000Test {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		
		while(true) {			
			sum += num;
			if (sum >= 1000) 
				break;

			num += 1;
		}

		System.out.printf("%d %d", num, sum);
	}

}
