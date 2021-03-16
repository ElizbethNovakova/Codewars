import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*

Write a method, that will get an integer array as parameter and will process every number from this array.
        Return a new array with processing every number of the input-array like this:
        If the number has an integer square root, take this, otherwise square the number.

 */

public class Kata {
    public static int[] squareOrSquareRoot(int[] array)
    {

        // Solution with Stream Java
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();


        /*

        int[] result = new int[array.length];
        for(int i =0; i < array.length; i++){
            if(Math.sqrt(array[i])%1 == 0){
                result[i] = (int) Math.sqrt(array[i]);
            } else {
                result[i] = array[i] * array[i];
            }
        }

        return result;
         */
    }

    public static void main(String[] args) {
        int []input = new int[] { 4, 3, 9, 7, 2, 1  };
        int [] result = squareOrSquareRoot(input);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}