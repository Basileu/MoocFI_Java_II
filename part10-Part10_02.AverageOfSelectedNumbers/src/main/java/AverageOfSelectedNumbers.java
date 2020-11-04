
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<>();

        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");

        String line = null;
        while (true) {
            line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            myList.add(line);
        }
        
        // Ask for input
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        line = scanner.nextLine();
        double average  = 0;
        if (line.equals("p")) {
            average = myList.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(nr -> nr > 0)
                            .average()
                            .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
                                
        } else if (line.equals("n")) {
            average = myList.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(nr -> nr < 0)
                            .average()
                            .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        
    }
}
