
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();

        // Write your program here
        String line = null;

        while (true) {
            line = scanner.nextLine();
            int nr = Integer.valueOf(line);
            if (nr < 0) {
                break;
            }
            myList.add(nr);
        }
        
        myList.stream().filter(nr -> ((nr >= 1)&& (nr <=5))).forEach(s -> System.out.println(s));

    }
}
