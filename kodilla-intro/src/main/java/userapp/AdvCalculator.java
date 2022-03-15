package userapp;

public class AdvCalculator {
    public static void main(String[] args){
//        userapp.AdvCalculator calculator = new userapp.AdvCalculator();
//        double result = calculator.calculate();
//        System.out.println(result);
        String color = UserDialogs.getUsersColorSelection();
        System.out.println(color);
    }

    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        double result = 0;
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (userSelected) {
            case "ADD":
                result = a + b;
                break;
            case "SUB":
                result= a - b;
                break;
            case "DIV":
                result= a / b;
                break;
            case "MUL":
                result= a * b;
                break;
        }
        return result;
    }
}
