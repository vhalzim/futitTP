// 2nd task. The magic square.

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //input of the numbers tha t asumes the vaue of n
        Scanner scan = new Scanner(System.in);
        System.out.print("number:");
        int value = scan.nextInt();
        if (value % 2 == 0){
            System.out.println("The number must be odd");
        } else{
            int [][] magicSquare = new int [value][value];
            int rowIndex = 0;
            int columIndex = value / 2;
            //array[rowIndex][columIndex];
            for (int i = 1; i <= (value * value); i++){
                if(rowIndex == -1){
                    rowIndex = value-1;
                } if (columIndex == value){
                    columIndex = 0;
                } if(magicSquare [rowIndex][columIndex] != 0){
                    columIndex--;
                    rowIndex += 2;
                    if (columIndex == -1){
                        columIndex = value-1;
                    }
                    if (rowIndex>value){
                        int newValue = rowIndex - value;
                        rowIndex = newValue; 
                    }
                }
                magicSquare [rowIndex][columIndex] = i;
                columIndex ++;
                rowIndex--;
            }
            System.out.println(Arrays.deepToString(magicSquare));   
        } 
    }

}
