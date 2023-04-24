package gRoupProject2Coding;

public class Task2 {
    /*
    Create an array of integer values. After the array is
    created, calculate the sum of all stored elements in
    that array.
     */
    public static void main(String[] args) {
        int values[]={20,30,40,50};
        int sum=0;

        for (int i : values) {
            sum += i;
        }
        System.out.println(sum);
    }
}
