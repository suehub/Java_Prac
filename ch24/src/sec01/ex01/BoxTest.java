package sec01.ex01;

public class BoxTest {
    public static void main(String[] args) {
        Box<Person> box = new Box<Person>();    // Person 클래스 타입으로 제네릭 지정해서 객체 생성

        box.setData(new Person("손흥민"));
        System.out.println(box.getData());

        box.setData(new Student("황희찬", 3));
        System.out.println(box.getData());

        box.setData(new College("김민재", 2, 23));
        System.out.println(box.getData());

    }
}
