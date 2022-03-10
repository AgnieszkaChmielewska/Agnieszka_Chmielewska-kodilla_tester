public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year){
        this.weight=weight;
        this.price=price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price<900 ){
            System.out.println("This notebook is cheap.");
        } else if (this.price<=1800){
            System.out.println("This notebook is good.");
        }
        else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight(){
        if (this.weight == "300g" ){
            System.out.println("This notebook is light.");
        } else if (this.weight == "1200g"){
            System.out.println("This notebook is not too heavy.");
        }
        else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkIfItsWorthBuying(){
        if (this.year>2020 && this.price<1500){
            System.out.println("Don't think too long. This notebook is just worth buying.");
        } else if (this.year>2020 && this.price>1500){
            System.out.println("Don't buy it. Wait for Black Friday.");
        } else if (this.year<2020 && this.price>700){
            System.out.println("Check the size of the hard disk before you decide.");
        }
        else {
            System.out.println("If it works and you need it for writing only, you can buy it.");
        }
    }
}
