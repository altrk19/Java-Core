package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = e -> System.out.println("print:" + e);
        Predicate<Integer> predicate = e -> e % 2 == 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().filter(predicate).forEach(consumer);

        //or
        list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("print even:" + e));
    }
}
