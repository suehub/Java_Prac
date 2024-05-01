import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Apple", "Banana", "Cherry", "Date");
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Consumer<String> printFruit = System.out::println;
        streamSupplier.get().filter(startsWithA).forEach(printFruit);

        // Stream 객체를 생성해서 흐름을 만든뒤 supplier로 대상이 되는 객체들을 집어넣어주고
        // predicate를 통해서 그중에서 찝어내걸 조건을 단 다음에
        // Consumer로 predicate에서 사용된걸 활용하는거죠


        // 코드보시면 predicate랑 consumer랑 결국 조건을 거는건 똑같지 않냐고 생각할수있는데 맞습니다.
        // 다만 predicate와 consumer의 차이는 전자는 if문처럼 참인지 거짓인지 리턴하고, 후자는 리턴을 안합니다
    }
}