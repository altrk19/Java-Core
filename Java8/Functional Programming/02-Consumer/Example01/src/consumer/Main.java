package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = e -> System.out.println("printing:" + e);
        consumer.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().forEach(consumer);

        list.stream().forEach(e -> System.out.println("print:" + e));
    }
}
