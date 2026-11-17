/*
 * Problem: Write a generic method that prints the elements of any
 *          array type (demonstrated with Integer[] and String[]).
 */
public class GenericArray {
    
    public static <T> void printArray(T[] array){ //<T> for type defination and void for return types
        for(T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"A","B","C"};

        printArray(intArray);
        printArray(stringArray);
    }

}
