public class MainExtended {
    public static void main(String [] args){
        String myName = "Agnieszka";
        String country = "PL";
        int yearOfBirth = 2000;
        boolean areYouPolish = true;
        double price = 3.14;
        char group = 'A';
        String why = sayHello();
        System.out.println( myName + ", " +country + ", year of birth: "+ yearOfBirth);
        System.out.println( "Polish nationality: "+areYouPolish );
        System.out.println(group +", "+price);
        System.out.println(why);
    }

    private static String sayHello() {
        String text = "Hello from FirstClass!";
        return text;
    }
}


