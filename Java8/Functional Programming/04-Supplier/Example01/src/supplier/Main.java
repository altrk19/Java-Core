package supplier;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi Ali";
        System.out.println(supplier.get());

//        List<String> list = Arrays.asList("a", "b");
        List<String> list = Collections.emptyList();
        String str1 = list.stream().findAny().orElseGet(supplier);
        System.out.println(str1);
        //or
        String str2 = list.stream().findAny().orElseGet(() -> "Hi Ali");
        System.out.println(str2);
    }
}
