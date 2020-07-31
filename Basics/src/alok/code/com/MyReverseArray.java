package alok.code.com;

import java.util.Scanner;

public class MyReverseArray {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int sizeOfInt = s.nextInt();
        // validate the input
        if ( sizeOfInt >= 0 && sizeOfInt <= 100 ) {
            int[] arr = new int[sizeOfInt];
            for (int i = 0; i < sizeOfInt; i++) {
                int enteredValue = s.nextInt();
                if (enteredValue >= 0 & enteredValue <= 1000)
                    arr[i] = enteredValue;
                else
                    System.out.println("Value entered is not allowed - should greater than 0 and less than 1000");
            }// reverse it now
            for (int i = sizeOfInt; i > 0; i--) {
                System.out.println(arr[i - 1]);
            }
        } else {
            System.out.println("Size of myarray should greater than 0 and less than 100");
        }
    }
}
