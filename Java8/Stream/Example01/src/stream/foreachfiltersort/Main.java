package stream.foreachfiltersort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays. asList ("element2", "element1", "element3", "element4");
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a"); map.put(2,"b"); map.put(3,"c"); map.put(4,"d");

        printListElements(list);
        printMapElements1(map);
        printMapElements2(map);
        printFilteredListElements(list);
        printFilteredMap(map);
    }

    private static void printListElements(List<String> list) {
        list.stream().forEach(System.out::println);
        System.out.println("-------");
    }

    private static void printMapElements1(Map<Integer, String> map) {
        map.forEach((key,value)-> System.out.println(key+":"+value));
        System.out.println("-------");
    }
    private static void printMapElements2(Map<Integer, String> map) {
        map.entrySet().stream().forEach(e-> System.out.println(e));
        System.out.println("-------");
    }

    private static void printFilteredListElements(List<String> list) {
        System.out.println("Filtered List");
        list.stream().filter(s -> s.length() == 8).sorted().limit(2).forEach(System.out::println);
        System.out.println("-------");
        list.stream().filter(s->s.length()==8).sorted().limit(2).peek(System.out::println).count();   //count() yazmayınca çalışmıyor
        System.out.println("-------");
        System.out.println(list.stream().sorted().limit(2).collect(Collectors. toList()));
        System.out.println("-------");
    }

    private static void printFilteredMap(Map<Integer, String> map) {
        System.out.println("Filtered Map:");
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(e-> System.out.println(e));

    }
}
