
package gRoupProject2Coding;

import java.util.Arrays;

public class Task9 {
    /*
    Write a java program to find the second largest number in the array?
     */
    public static void main(String[] args) {
        int num[] = {5, 10, 15, 20, 25, 30, 35, 45};
        Arrays.sort(num);
        System.out.print("Second largest number in the array is " + num[num.length - 2]);
    }
}