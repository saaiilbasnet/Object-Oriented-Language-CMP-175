/*
 * Problem: Create a 5-element int array, read its values from the user
 *          with Scanner, then print them back.
 */
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a[" + i + "]: ");
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
