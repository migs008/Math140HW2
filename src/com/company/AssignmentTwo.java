package com.company;

public class AssignmentTwo {

    public static void main(String[] args) {
        // write your code here
    }

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
}