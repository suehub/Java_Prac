package sec01.ex01;

public class Box<T extends Person> {    // Person 클래스를 상속받는 클래스는 제네릭 타입으로 지정 가능
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
