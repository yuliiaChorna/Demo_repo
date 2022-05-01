import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.print("Enter size: ");
       int size = console.nextInt();
       System.out.println("Size is " + size);

       int[] myArray = new int[size];

       for (int i = 0; i < myArray.length; i++) {
           System.out.println("Entre value: ");
           myArray[i] = console.nextInt();
       }
       for (int x : myArray) {
           System.out.print("[" + x + "] ");
       }
        //        int [] array = {19, -2, -8, 7, 9, -10, -5, 3};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                System.out.println(array[i]);
//            }
//        }




//Swamp max and min values
//      int [] array = {19, -2, -8, 7, 9, -10, -5, 3};
//      for (int x : array) {
//          System.out.print("[" + x +"] ");
//      }
//        System.out.println();
//      int max = array[0];
//      int indexOfMax = 0;
//      int min = array[0];
//      int indexOfMin = 0;
//      for (int i = 0; i < array.length; i++) {
//          if (array[i] > max) {
//              max = array[i];
//              indexOfMax = i;
//          }
//          if (array[i] < min) {
//              min = array[i];
//              indexOfMin = i;
//          }
//
//      }
//      int temp = array[indexOfMax];
//      array[indexOfMax] = array[indexOfMin];
//      array[indexOfMin] =temp;
//        for (int x : array) {
//            System.out.print("[" + x +"] ");
//        }
//        System.out.println();
//      int min = array[0];
//      for ( int y : array) {
//          if (y < min) {
//              min = y;
//          }
//      }
//        System.out.println(min);

//        int max = array[0];
//        for (int j : array) {
//            if (j > max) {
//                max = j;
//            }
//        }
//        System.out.println(max);

//        int sum = 1;
//        for ( int x : array) {
//            sum *= x;
//
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for ( int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum +i;
//
//        }
//        System.out.println(sum);

//        int a = 5;
//        int b = 10;
//        if (a < b) {
//            System.out.println("It`s right");
//        } else {
//            System.out.println("It`s wrong");
//        }


//        int[] myArray = {8,22,13};
//
//        for (int x : myArray){
//            System.out.println(x);
//
//
//        }

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
//        int i = 0;
//        do {
//            System.out.println(myArray[i]);
//            i++;
//        }
//        while (i < myArray.length);







    }
}
