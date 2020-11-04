
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));      

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int startIndex = fromWhere < 0 ? 0 : fromWhere;
        int endIndex = toWhere > array.length ? array.length : toWhere;

//        List<Integer> myList = Arrays.asList(array);
//        Stream<Integer> str = Arrays.
        int sum = IntStream.of(Arrays.copyOfRange(array, startIndex, endIndex))
                .filter(nr -> nr <= largest && nr >= smallest)
                .reduce(0, (s, p) -> s + p);

        return sum;

    }

}
