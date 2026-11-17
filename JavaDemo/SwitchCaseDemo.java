/*
 * Problem: Print the day name for a number 1-3 (default for anything
 *          else) using switch-case.
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            default: System.out.println("Invalid");
        }
    }
}
