public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Wyświetlanie elementów tablicy
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int a = 0; a < names.length; a++) {
            System.out.println(names[a]);
        }
        // Wyświetlanie elementów tablicy od tyłu
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        int a = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        //tworzę tablicę z argumentami ot typie int i 3 wartościami
        int[] x = new int[]{12, 12, 3};
        sumNumbers(x);
    }

    public static int sumNumbers (int[] numbers) {

        int result = 0;
        for (int i = 0;i<numbers.length; i++){
            result = result+ numbers[i];
            System.out.println(result);
        }
        return result;
    }

}