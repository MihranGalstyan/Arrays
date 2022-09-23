/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class ArrayManipulation {
    public static void main(final String[] args) {
        // Original array
        int[] arrayA = new int[900];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i + 100;
        }

        for (final int i : arrayA) {
            System.out.print(" " + i);
        }

        // Reverse array
        int[] arrayB =new int[arrayA.length];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = arrayA[arrayA.length - 1 - i];
        }

        System.out.println("Array B");
        for (final int i : arrayB) {
            System.out.print(" " + i);
        }
    }
}
