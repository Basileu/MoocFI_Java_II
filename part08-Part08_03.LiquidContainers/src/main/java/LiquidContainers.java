
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + cont1 + "/100");
            System.out.println("Second: " + cont2 + "/100");

            String input = scan.nextLine();
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
                    cont1 += amount;
                    if (cont1 > 100) {
                        cont1 = 100;
                    }
                } else if (command.equals("move")) {
                    cont2 += amount > cont1 ? cont1 : amount;
                    if (cont2 > 100) {
                        cont2 = 100;
                    }
                    cont1 -= amount;
                    if (cont1 < 0) {
                        cont1 = 0;
                    }
                } else if (command.equals("remove")) {
                    cont2 -= amount;
                    if (cont2 < 0) {
                        cont2 = 0;
                    }
                }

            }

        }
    }
}
