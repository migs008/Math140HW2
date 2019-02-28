/*
Author: Miguel Aquino
Date: 2/27/2019
Purpose: An AssignmentTwo class that contains the five static
methods for reviewing on how to work with two-dimensional arrays, threedimensional
arrays, and the System.arraycopy method.
*/

package com.company;

public class AssignmentTwo {

    /*
    Purpose: A static method that counts the number of elements in a 2D array.
    Parameters: int[][] twoDim takes a two-dimensional array as an argument.
    Return: The number of elements in the array, not counting the null values.
    */
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

    /*
    Purpose: A static method that counts the number of elements in a 3D array.
    Parameters: int[][][] threeDim takes a three-dimensional array as an argument.
    Return: The number of elements in the array, not counting the null values.
    */
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

    /*
    Purpose: A static method that turns a 2D array into a one-dimensional array.
    Parameters: int[][] arr takes a two-dimensional array as an argument.
    Return: A single one-dimensional array.
    */
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

    /*
    Purpose: A static method that turns a 3D array into a one-dimensional array.
    Parameters: int[][][] arr takes a two-dimensional array as an argument.
    Return: A single one-dimensional array.
    */
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

    /*
    Purpose: A meaningful description of the method/constructor.
    Parameters: Describe the purpose of each parameter
    Return: A description of the return value.
    */
    public static int[] removeLargest(int[] arr) {
        int[] tmp = null;
        int dest_arr = 0;
        int largestNumber = 0;


        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[largestNumber] && arr.length > 1) {
                    tmp = new int[arr.length - 1];
                    largestNumber = i;
                    System.arraycopy(arr, 0, tmp, 0, largestNumber);
                    System.arraycopy(arr, largestNumber + 1, tmp, largestNumber, arr.length - largestNumber - 1);
                }
                else {
                    tmp = arr;
                }
            }
        }
        return tmp;
    }
}