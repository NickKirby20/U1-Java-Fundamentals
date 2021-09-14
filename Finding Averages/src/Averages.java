public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */

    public static void main(String[] args) {
        int testScore1 = 123246;
        int testScore2 = 13546311;
        int testScore3 = 141111;
        int testScore4 = 1577777;

        int sumTotal = testScore1 + testScore2 + testScore3 + testScore4;
        double average = sumTotal/4.0;

        System.out.println("The average is " + average);
      }
    }