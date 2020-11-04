
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        
        int nr = Integer.valueOf(scanner.nextLine());
        Random myRand = new Random();
        for (int i = 0; i < nr; i++) {
            System.out.println(myRand.nextInt(11));
        }
    }

}
