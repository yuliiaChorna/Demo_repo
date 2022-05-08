package Home_work_refactoring;

public class Main {
    public static void main(String[] args) {

        ConsoleController consoleController = new ConsoleController();

        int[] inputArray = consoleController.getArrayFromConsole();

        consoleController.out( "inputArray: " );
        consoleController.printArray(inputArray);

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

        consoleController.out("resultArray: ");
        consoleController.printArray(resultArray);

    }
}
