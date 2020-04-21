package general.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class FunctionalLambda {

    public static void main(String[] args){
        int[] numbers = new int[] {2, 5, 6, 8};
        int key = 0;

        addKey(numbers, key, lambdaWrapped((k, v) -> {
            System.out.println(k / v);
        }));
    }
    static void addKey(int[] numbers, int key, BiConsumer<Integer,Integer> consumer){
        List<Integer> list = Arrays.stream(numbers)
                                    .boxed()
                                    .collect(Collectors.toList());
        list.forEach(k -> consumer.accept(k, key));
    }

    static BiConsumer<Integer, Integer> lambdaWrapped(BiConsumer<Integer, Integer> consumer) {
        return (k, v) -> {
            try {
                consumer.accept(k, v);
            }catch(ArithmeticException ex){
                System.out.println("Exception caught : " + ex);
            }
        };
    }
}
