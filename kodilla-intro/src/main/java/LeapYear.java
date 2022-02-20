public class LeapYear {
    public static void main (String [] args){
        int year =2021;

        if (year%4!=0 ){
           System.out.println("Podany rok nie jest przestępny");
        }else if ( year%100!=0 ){
            System.out.println("Podany rok jest przestępny");
        }
        else if (year%400!=0){
            System.out.println("Podany rok nie jest przestępny");
        }
        else {
            System.out.println("Podany rok jest przestępny");
        }
    }
}
