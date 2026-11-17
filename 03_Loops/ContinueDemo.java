/*
 * Problem: Demonstrate `continue` by skipping the print when i equals 3
 *          in a for-loop.
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Saaiil");
        }
    }
}
