package Home_work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter inputArray`s size: " );
        int inputArraySize = console.nextInt();
        System.out.println("Size is " + inputArraySize);

        int[] inputArray = new int[inputArraySize];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println( "Enter inputArray`s value: ");
            inputArray[i] = console.nextInt();
        }

        System.out.print( "inputArray: " );

        for ( int x : inputArray) {
            System.out.print( "[" + x + "] ");
        }

        System.out.println();

        int resultArraySize = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (i > 0) {
                resultArraySize++;
            }
        }

        int[] resultArray = new int[resultArraySize];

        int resultCounter = 0;

       for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                resultArray[resultCounter] = inputArray[i];
                resultCounter++;
           }
        }

        System.out.print("resultArray: ");

        for (int x : resultArray) {
            System.out.print( "[" + x + "] ");
        }

    }
}






