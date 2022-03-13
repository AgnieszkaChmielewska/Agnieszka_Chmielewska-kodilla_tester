import java.util.Random;

public class RandomNumbers {
    public static void main (String[] args) {
        getSumOfRandomNumbers(5000);
        }

    public static int getSumOfRandomNumbers(int max){
        Random randomNumber = new Random();
        int result = 0;
        int sum = 0;
        int theSmallestRandomNumber = max;
        int theBiggestRandomNumber = 0;

        while (sum < max) {
            int a = randomNumber.nextInt(30);
            System.out.println("Random number:"+a);
            sum = sum+a;
            System.out.println("Suma:" +sum);
            if (a<theSmallestRandomNumber){
                theSmallestRandomNumber = a;
            }
            System.out.println("The smallest random number was:"+theSmallestRandomNumber);
            if (a>theBiggestRandomNumber){
                theBiggestRandomNumber = a;
            }
            result ++;
            System.out.println("The biggest random number was:"+theBiggestRandomNumber);
         }
        return result;
    }
}