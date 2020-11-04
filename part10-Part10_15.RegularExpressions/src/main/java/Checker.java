
public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
//            System.out.println("The form is correct.");
            return true;
        } else {
//            System.out.println("The form is incorrect.");
            return false;
        }
    }

    public boolean allVowels(String string) {
        if (string.matches("[aeoui]*")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean timeOfDay(String string) {
        if (string.matches("(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])")) {
            return true;
        } else {
            return false;
        }
    }
}
