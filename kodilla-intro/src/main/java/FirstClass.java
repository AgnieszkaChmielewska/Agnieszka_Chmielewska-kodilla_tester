public class FirstClass {
    public static void main (String [] args) {

        Notebook notebook = new Notebook("300g", 3000, 2019);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkIfItsWorthBuying();

        Notebook heavyNotebook = new Notebook("2000g", 1800, 2022);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkIfItsWorthBuying();

        Notebook oldNotebook = new Notebook("1200g", 400, 2002);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkIfItsWorthBuying();

//        wywołanie metody println z klasy out, która wyświetla dane (Typ zwracany void  tj. pustka, czyli nie zwraca)
//        String element= "Actions speak lauder than words";
//        System.out.println(element);
    }

    // metoda, która zwraca dane, typ zwracany to String
    //Zwracana wartość nie jest wyświetlana jest zwrócna, nie bedzie widoczna w konsoli
    private static String sayHello() {
        String welcomeSentence = "Welcome to your new life!";
        return welcomeSentence;
    }
   }