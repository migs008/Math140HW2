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

    }
}
