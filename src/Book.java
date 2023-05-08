public class Book {
    private String title;
    private int price;
    // 필드의 값을 수정하거나 얻기위하여 메소드를 만든다. 이런 메소드를 setter, getter 이라고 한다.
    //setter, getter 메소드를 우리는 프로퍼티(property) 라고 한다. 여긴 price 프로퍼티라고 한다.
    public int getPrice() {
        return this.price * 2; // this는 내 자신 인스턴스를 참조하는 예약어.
    }
    public void setPrice(int price) { //지역변수
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
