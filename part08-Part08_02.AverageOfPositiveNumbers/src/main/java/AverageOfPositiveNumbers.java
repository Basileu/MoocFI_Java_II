
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myIntList = new ArrayList<>();

        while (true) {
            int nr = Integer.valueOf(scanner.nextLine());
            if (nr == 0) {
                if (myIntList.size() == 0) {
                    System.out.println("Cannot calculate the average");
                    
                } else {
                    int sum = 0;
                    int cnt = 0;
                    for (Integer integer : myIntList) {
                        if (integer > 0) {
                            sum += integer;
                            ++cnt;
                        }
                    }
                    System.out.println((double)sum/cnt);
                }
                break;
            } else {
                myIntList.add(nr);
            }
        }
    }
}
