import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
    RandomNumbers r = new RandomNumbers();
        r.getSumOfRandomNumbers(5000);
        r.getTheSmallestRandomNumber(5000);
        r.getTheBiggestRandomNumber(5000);
    }

    int max;
    int theSmallestRandomNumber = max;
    int theBiggestRandomNumber = 0;

    public int getSumOfRandomNumbers(int max) {
        Random randomNumber = new Random();
        int result = 0;
        int sum = 0;


        while (sum < max) {
            int a = randomNumber.nextInt(30);
            System.out.println("Random number:" + a);
            sum = sum + a;
            System.out.println("Suma:" + sum);

            if (a < theSmallestRandomNumber) {
                theSmallestRandomNumber = a;
            }

            System.out.println("The smallest random number was:" + theSmallestRandomNumber);
            if (a > theBiggestRandomNumber) {
                theBiggestRandomNumber = a;
            }
            System.out.println("The biggest random number was:" + theBiggestRandomNumber);

            result++;
        }
        return result;
    }

    public int getTheSmallestRandomNumber(int max) {
    return theSmallestRandomNumber;
    }

    public int getTheBiggestRandomNumber(int max) {
        return theBiggestRandomNumber;
    }
}
