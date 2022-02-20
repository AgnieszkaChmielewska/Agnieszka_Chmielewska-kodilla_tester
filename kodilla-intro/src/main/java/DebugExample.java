public class DebugExample<yourAge> {
    public static void main (String[] args) {
        int firstNumber = 23;
        int secondNumber = 22;
        int yourAge = 23;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        sumAndDisplay(firstNumber, secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }

        if (yourAge < 10) {
            System.out.println("You area kid");
        } else if (yourAge>10 && yourAge<18){
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are adult");
        }

    }


private static void sumAndDisplay(int a, int b){
        int result = a+b;

        System.out.println(result);
    }
    private static void subtractAndDisplay(int a, int b){
        int result = a-b;
        System.out.println(result);
    }

}
