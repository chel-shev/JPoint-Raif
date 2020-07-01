import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        List<String> arrays = Arrays.asList("AAAAA", "AAAAABBBC", "", null, "ABC", "ABBBBBC");
        arrays.stream().map(i -> new StringConversion(i).getConvertedString()).forEach(System.out::println);
    }
}
