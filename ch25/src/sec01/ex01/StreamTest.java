package sec01.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> fruitList1 = Arrays.asList("apple", "banana", "orange", "pineapple", "mango");
        Iterator<String> iterator = fruitList1.iterator();

        // 1. iterator 사용
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        System.out.println("--------------------");

        // Stream 사용할 경우
        List<String> fruitList2 = Arrays.asList("apple", "banana", "orange", "pineapple", "mango");
        Stream<String> fruitStream2 = fruitList2.stream();  // 스트림 객체 얻음
        fruitStream2.forEach(name -> System.out.println(name)); // 스트림 객체로 얻어온 데이터를 forEach() 메서드로 출력

        // 2. Enhanced For
        for (var fruit : fruitList2) {
            System.out.println(fruit);
        }

        System.out.println("--------------------");

        // 3. Stream
        var fruitStream = fruitList2.stream();
        fruitStream.forEach(System.out::println);
        // fruitStream.forEach(name -> System.out.println(name));
    }
}
