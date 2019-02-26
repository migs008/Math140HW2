package com.company;

public class Test {

    public static void displayOneDimArr(int[] arr) {
        if (arr == null) {
            System.out.println("null");
        } else if (arr.length == 0) {
            System.out.println("Array length = zero");
        } else {
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        AssignmentTwo hwTwo = new AssignmentTwo();

        System.out.println("Method 1: Test numElements(int[][]): ");
        int[][] arrTwo = null;
        System.out.print("Results when arr = null: ");
        System.out.println(hwTwo.numElements(arrTwo));

        arrTwo = new int[][]{null, null, null, null, null};
        System.out.print("Results when all rows are null: ");
        System.out.println(hwTwo.numElements(arrTwo));

        arrTwo[1] = new int[]{9, 0, 8, 7};
        arrTwo[3] = new int[]{-3, 4, 8, 7, 11, 15, 8, 0};
        System.out.print("Results when some rows are null: ");
        System.out.println(hwTwo.numElements(arrTwo));

        arrTwo[0] = new int[1000];
        arrTwo[2] = new int[7];
        arrTwo[4] = new int[2];
        System.out.print("Results when all rows are non-null: ");
        System.out.println(hwTwo.numElements(arrTwo));

        System.out.println("\nMethod 2: Test numElements(int[][][]): ");
        int[][][] arrThree = null;
        System.out.print("Results when arr = null: ");
        System.out.println(hwTwo.numElements(arrThree));

        arrThree = new int[][][]{null, null, null, null, null, null};
        System.out.print("Results when all arrays are null: ");
        System.out.println(hwTwo.numElements(arrThree));

        arrThree[2] = arrThree[4] = arrTwo;  // each 2D array has 1021 values
        System.out.print("Results when some arrays are null: ");
        System.out.println(hwTwo.numElements(arrThree));  // 2042

        arrThree[0] = new int[90][1];   // 90
        System.out.print("Results when some arrays are null: ");
        System.out.println(hwTwo.numElements(arrThree));  // 2132

        arrThree[1] = new int[8][2];   // 16
        arrThree[3] = new int[3][3];    // 9
        arrThree[5] = new int[10][2];   // 20
        System.out.print("Results when all arrays are null: ");
        System.out.println(hwTwo.numElements(arrThree));  // 2177


    }
}
