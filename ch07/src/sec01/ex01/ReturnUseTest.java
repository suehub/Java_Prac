package sec01.ex01;

public class ReturnUseTest {

	public static void main(String[] args) {
		ReturnUseTest m = new ReturnUseTest();
		m.PrintSumTo0100();
		
		

	}
	
	public void PrintSumTo0100() {
		int sum = 0, i = 1;
		
		while(true) {
			sum += i;
			if(sum >= 1000) {
				System.out.println("i = " + i + ", sum = " + sum);
				return;
			} else {
				i += 2;
			}
		}
		
	}

}
