public class Person {
    String name; //인스턴스 필드 (no static )
    String address;
    boolean isVip;
    static int count; //  클래스 필드
    static{ //클래스 필드는 static 블록에서 초기화가 가능하다.
        count = 100;
    }

    public void printName(){ //인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }
    public static void printCount(){ // 클래스 메소드
        //System.out.println(name); static 한 메소드에선 인스턴스 필드나 인스턴스 메소드를 사용 불가하다.
        System.out.println("count : " + count);
    }
}
