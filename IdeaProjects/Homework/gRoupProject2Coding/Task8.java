package gRoupProject2Coding;

public class Task8 {
    /*
     Maximum and minimum number in the array?
      */
    public static void main(String[] args) {
        int num[] = {20, 36, 65, 80, 33, 46};

        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}

