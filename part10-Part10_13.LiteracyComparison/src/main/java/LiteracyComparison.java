
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {

//        System.out.println("Starting...");
        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(str -> str.split(","))
            // .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
            .filter(x -> x.length >=6)
            .map(LiteracyComparison::foo)
            .map(parts -> new Population(parts[2], (parts[3]), Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
            .sorted()
            .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("exception caught !!!! " + e.getMessage());
        }    }
    
    public static String[] foo(String[] arr) {
        int size = arr.length;
        String[] arrRet = new String[size];
        for (int i = 0; i < arr.length; i++) {
            arrRet[i] = arr[i].trim();
            if (i==2) {
                // arrRet[i] = arrRet[i].
                String [] arrSpace = arrRet[i].split(" ");
                arrRet[i] = arrSpace[0];
            }
        }
        return arrRet;

    }    
}
