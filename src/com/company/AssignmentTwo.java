package com.company;

public class AssignmentTwo {

    public static void main(String[] args) {
	// write your code here
    }

    public static int numElements(int[][] twoDim) {
        int num = - 1;
        if (twoDim != null) {
            num = 0;
            for (int[] x: twoDim) {
                if (x != null) {
                    num += x.length;
                }
            }
        }
        return num;
    }

}
