
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = new ArrayList<>();

        // Write your program here
        String line = null;

        while (true) {
            line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            myList.add(line);
        }
        String str = myList.stream()
                    .reduce("", (previousStr, string)-> previousStr + string + "\n");

//        System.out.println(myList);
//        String str = "";
//        for (int i = 0; i < myList.size(); i++) {
//            if (i < myList.size() - 1) {
//                str += myList.get(i) + "\n";
//            } else {
//                str += myList.get(i);
//            }
//        }
        
        System.out.println(str);
    }
}
