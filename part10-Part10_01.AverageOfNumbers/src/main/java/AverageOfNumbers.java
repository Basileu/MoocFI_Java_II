
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<>();
//        myList.clear();
//        Avera
        // Write your program here
        String line = null;
        
        while(true) {
            line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            System.out.println("line = " + line);
            myList.add(line);
        }
        System.out.println(myList +"\n\n\n");
        double average = myList.stream()
                        .mapToInt(mapper -> Integer.valueOf(mapper))
                        .average()
                        .getAsDouble();
        
        System.out.println("average  = " + average);
                        

    }
}
