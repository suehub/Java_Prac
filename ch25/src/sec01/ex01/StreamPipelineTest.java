package sec01.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 2, 70));
        studentList.add(new Student("이순신", 3, 80));
        studentList.add(new Student("박찬호", 1, 90));
        studentList.add(new Student("손흥민", 2, 100));
        studentList.add(new Student("황희찬", 3, 77));
        studentList.add(new Student("김민재", 1, 88));

        Stream<Student> stdStream = studentList.stream();   // 컬렉션에서 원본 스트림 얻음
        Stream<Student> gradeStream = stdStream.filter(s->s.getGrade()==2);     // filter() 메서드로 2학년 학생으로 구성된 스트림 얻음
        IntStream scoreStream = gradeStream.mapToInt(Student::getScore);    // 2학년 학생 스트림에서 학생들의 점수 스트림으로 얻음
        OptionalDouble optionalDouble = scoreStream.average();  // 최종 처리 스트림 메서드로 시험 점수 평균 구함
        double avgScore1 = optionalDouble.getAsDouble();
        System.out.println("2학년 평균 점수: " + avgScore1);

        double avgScore2 = studentList.stream() // 원본 스트림
                .filter(s->s.getGrade()==3)     // 중간 처리 스트림
                .mapToInt(Student::getScore)    // 중간처리 스트림
                .average()                      // 최종 처리 스트림
                .getAsDouble();

        System.out.println("3학년 평균: " + avgScore2);

    }
}
