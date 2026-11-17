/*
 * Problem: Calculate the average of the numbers in a fixed int array.
 */
public class ArrayAvg {
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12, -100, 234};
        float sumvar = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumvar = numbers[i] + sumvar;
        }

        float average = sumvar / (numbers.length);

        System.out.println("Average : " + average);
    }
}
