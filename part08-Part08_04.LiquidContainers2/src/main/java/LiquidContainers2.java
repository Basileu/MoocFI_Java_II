
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();


        while (true) {
            System.out.print("> ");
            System.out.println("First: " + cont1);
            System.out.println("Second: " + cont2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            if (input.equals("quit")) {
                break;
            } else {
                // read command and split it
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                //Ignore negative quantities
                if (amount < 0) {
                    continue;
                }

                if (command.equals("add")) {
                    cont1.add(amount);
                } else if (command.equals("move")) {
                    int volAvailable = cont1.getAmount();
                    cont2.add(amount>volAvailable?volAvailable:amount);
                    cont1.remove(amount);
                    
                } else if (command.equals("remove")) {
                    cont2.remove(amount);
                }

            }

        }
    }

}
