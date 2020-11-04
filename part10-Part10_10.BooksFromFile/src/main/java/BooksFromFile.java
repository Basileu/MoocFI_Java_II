
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> myList = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
            .map(str -> str.split(","))
            .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
            .forEach(book -> myList.add(book));
        } catch (Exception e) {
        }
        
        return myList;
    }
}
