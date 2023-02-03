//3rd. Task. All zeros to the rigth.

import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) throws Exception{
        // example array
        int []arr = {1, 0, 2, 5, 0, 3, 4 };
        int writeIndex = 0;
        int readIndex = 0;
        int totalNonZeroItems =0;

    for (; readIndex < arr.length; readIndex++) {
        if (arr[readIndex] != 0) {
            arr[writeIndex] = arr[readIndex];
            writeIndex++;
            totalNonZeroItems++;
        }
    }

    for (; writeIndex < arr.length ; writeIndex++) {
        arr[writeIndex] = 0;
    }

 

    System.out.println(totalNonZeroItems);
    System.out.println(Arrays.toString(arr));
   

}
    
}
