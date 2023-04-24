package gRoupProject2Coding;

public class Task1 {
        /*
        Create a program that uses an array to store a list of
        temperatures for a week1, and then uses a loop to find
        the highest and lowest temperature for the week.
         */
        public static void main(String args[]) {

            int weekTemp[] = new int[]{10, 12, 14, 16, 18, 20, 22};

            int low = weekTemp[0];
            int high = weekTemp[0];

            for (int i = 1; i < weekTemp.length; ++i) {
                if (weekTemp[i] > high)
                    high = weekTemp[i];

                if (weekTemp[i] < low)
                    low = weekTemp[i];
            }

            System.out.print("Lowest temperature of the week is: "+low);
            System.out.println();
            System.out.print("Highest temperature of the week is: "+high);
        }
    }
