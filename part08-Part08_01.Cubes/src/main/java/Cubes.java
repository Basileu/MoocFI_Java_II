
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cubes.main()");
        while(true) {
            String line = scanner.nextLine();
            if(line.equals("end")) {
                break;
            } else {
                int arc = Integer.valueOf(line);
                System.out.println(arc * arc * arc);
            }
        }
        
    }
}
