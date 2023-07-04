public class Data { int x; }

class Ex{
    public static void main(String args[]) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x) { //메서드의 매개변수가 기본형이면 > 읽기만 가능하다.
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}