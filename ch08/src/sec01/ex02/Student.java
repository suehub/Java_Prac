package sec01.ex02;

public class Student {
	String name; 
	String subject;
	int grade;
	int score;
	
	public void study() {
		System.out.println("오늘 공부 과목: " + subject);
	}
	
	public int test() {
		System.out.println(subject + " 시험을 칩니다.");
		
		return score;
	}
	
	public void getStudInfo() {
		System.out.println("이름: " + name + ", 학년: " + grade);
	}

}




