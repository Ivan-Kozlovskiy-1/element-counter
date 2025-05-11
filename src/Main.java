import java.util.*;

public class Main {
    public static <T> Map<T, Integer> countElements(List<T> list) {
        Map<T, Integer> result = new HashMap<>();
        for (T element : list) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> counts = countElements(input);
        System.out.println(counts);  // Пример вывода: {1=2, 3=1, 4=2, 5=2}
    }
}