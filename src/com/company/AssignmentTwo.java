package com.company;

public class AssignmentTwo {

    public static int numElements(int[][] twoDim) {
        int num = - 1;
        if (twoDim != null) {
            num = 0;
            for (int i = 0; i < twoDim.length; i++) {
                if (twoDim[i] != null) {
                    num += twoDim[i].length;
                }
            }
        }
        return num;
    }

    public static int numElements(int[][][] threeDim) {
        int num = -1;
        if (threeDim != null) {
            num = 0;
            for (int i = 0; i < threeDim.length; i++) {
                if(threeDim[i] != null) {
                    num += numElements(threeDim[i]);
                }
            }
        }
        return num;
    }


    public static int[] twoDimensionalToOneDimensional(int[][] arr) {
        int[]tmp = null;
        int dest_arr = 0;

        if (arr != null) {
            tmp = new int[numElements(arr)];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    System.arraycopy(arr[i], 0, tmp, dest_arr, arr[i].length);
                    dest_arr += arr[i].length;
                }
            }
        }
        return tmp;
    }

    public static int[] threeDimensionalToOneDimensional(int[][][] arr) {
        int[] tmp = null;
        int dest_arr = 0;

        if (arr != null) {
            tmp = new int[numElements(arr)];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] != null) {
                            System.arraycopy(arr[i][j], 0, tmp, dest_arr, arr[i][j].length);
                            dest_arr += arr[i][j].length;
                        }
                    }
                }
            }
        }
        return tmp;
    }
}