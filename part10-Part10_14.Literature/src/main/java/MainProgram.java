
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> myBookList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String line;
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String title = line;

            System.out.println("Input the age recommendation:");
            line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            int nr = Integer.valueOf(line);
            myBookList.add(new Book(title, nr));
        }
        System.out.println(myBookList.size() + " books in total.\nBooks:");
//        for (Book book : myBookList) {
//            System.out.println(book);
//        }
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
        Comparator cmpAge = Comparator.comparing(Book::getAgeRecommended)
                            .thenComparing(Book::getTitle);
        myBookList.stream().sorted(cmpAge).forEach(System.out::println);
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
//        for (Book book : myBookList) {
//            System.out.println(book);
//        }
        
    }

}
