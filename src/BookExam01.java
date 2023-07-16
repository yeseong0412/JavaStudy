public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("비매품");
        Book b3 = new Book("국어책", 1000);
        b1.showPrice();
        b2.showPrice();
        b3.showPrice();
    }
}
