import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTesting {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList(new String("a1"), new String("a2"), new String("a3"));

        //list.stream().forEachOrdered((p) -> p.append("_new")); // list - содержит [a1_new, a2_new, a3_new]

       // List<StringBuilder> newList = list.stream().peek((p) -> p.append("_new")).collect(Collectors.toList());
        //List<String> newList = list.stream().map((p) -> (p + "_new")).collect(Collectors.toList());
       // List<StringBuilder> newList = list.stream().peek((p) -> p.concat("b")).collect(Collectors.toList());

       // newList.forEach(System.out::println);

       // list.forEach((x) -> System.out.println(x));
        list.stream().map(String::toUpperCase).peek((e) -> System.out.print("," + e)).
                collect(Collectors.toList());

       list.forEach((x) -> System.out.println(x));



    }
}
