package Home_work_refactoring;

import java.util.Scanner;

public class ConsoleController {

    Scanner scanner = new Scanner(System.in);

    void outLn(String value) {
        System.out.println(value);
    }
    void out(String value) {
        System.out.print(value);
    }

    int readInt() {
        System.out.print("Enter int value: ");
        return scanner.nextInt();
    }

    void printArray(int[] array) {
        for(int x : array) {
            out("[" + x +  "] ");
        }
        outLn("");
    }

    int[] getArrayFromConsole() {
        outLn("inputArray`s size");
        int[] array;
        int size = readInt();
        array = new int[size];
        outLn("Size is " + size);
        return fillArray(array);

    }
    int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = readInt();
        }
        return array;


    }


}
