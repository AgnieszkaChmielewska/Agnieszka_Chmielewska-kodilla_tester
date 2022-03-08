public class FirstClass {
    public static void main (String [] args){
        //wywołanie metody println z klasy out, która wyświetla dane (Typ zwracany void  tj. pustka, czyli nie zwraca)
        System.out.println("Hello from FirstClass!");

        String element= "Actions speak lauder than words";
        System.out.println(element);
    }
    // metoda, która zwraca dane, typ zwracany to String
    //Zwracana wartość nie jest wyświetlana jest zwrócna, nie bedzie widoczna w konsoli
    private static String sayHello() {
        String welcomeSentence = "Welcome to your new life!";
        return welcomeSentence;
    }
}
