import userapp.UserDialogs;

public class ColorsSelector {
    public static void main(String[] args) {
        String selectedColor = UserDialogs.getUsersColorSelection();
        System.out.println("Selected color: " + selectedColor);
    }

}
