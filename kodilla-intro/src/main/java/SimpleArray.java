public class SimpleArray {
    public static void main(String [] args){
        String[] books = new String[5];
         books[0]="Atlas chmur";
         books[1]="Cień wiatru";
         books[2]="Miasto kości";
         books[3]="Jeździec miedziany";
         books[4]="Czerwień Rubinu";

//jak dostać się do konkretnej wartości z tablicy i zapisać ją do zmiennej
         String book = books[3];
         System.out.println(book);

         int numberOfElements = books.length;
         System.out.println("Moja tablica zawiera "+numberOfElements+" elementów.");
    }
}
