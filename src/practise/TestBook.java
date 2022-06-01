package practise;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setisbnid(5);
        book.setBookName("Tom Jones");
        book.setAuthorName("Henry Fielding");

        System.out.println(book);
    }
}
