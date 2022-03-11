public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades=new int[10];
        /*Zmienna size mówi nam, ile elementów aktualnie znajduje się w tablicy. Jej wartość powinna być modyfikowana, gdy zmieniamy wartości w tablicy.*/
        this.size = 0;
    }
/*Tworząc obiekt typu Grades, wywołujemy konstruktor. W konstruktorze dodaliśmy przypisanie nowej wartości do zmiennej przechowującej oceny.??*/

    public void add (int value){
        if (this.size ==10){
            return;
        }
        this.grades[this.size]=value;
        this.size++;
    }
    public int checkTheLastAddedValue(){
        int theLastValue = this.grades[this.size];
        return theLastValue;
    }

    public int getAverageGrade () {
        int sumOfValues = 0;
        int averageGrade = 0;

        for (int i = this.size; i >= 0; i--) {
            sumOfValues = this.grades[i] + sumOfValues;
        }

        averageGrade = sumOfValues / this.size;
        return averageGrade;
    }
}
