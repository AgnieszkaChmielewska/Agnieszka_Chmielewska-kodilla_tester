public class Book {
    public static void main(String[] args) {
        Book book = Book.isaacAsimov( "The Galaxy");
    }

    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book isaacAsimov (String title) {
        Book book = new Book ("Isaac Asimov", title);
        return book;
    }

}
