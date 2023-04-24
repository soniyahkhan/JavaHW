package gRoupProject2Coding;

public class Task10 {
    public static void main(String[] args) {
        /*
        10. write a program to print out duplicate elements from an array of strings?
         */

        String [] vegetables = { "potato", "aubergine", "tomato", "aubergine", "potato","mint", "turnip"};
        for (int i=0; i< vegetables.length; i++){
            for (int j=i+1; j< vegetables.length; j++){
                if (vegetables [i]==vegetables[j]) {
                    System.out.println(vegetables[j]);

                }
            }
        }

    }

}
