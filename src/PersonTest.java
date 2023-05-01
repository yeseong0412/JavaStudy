public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person(); //       Person p1 == null
        Person p2 = new Person();
        p1.name = "홍길동"; // 문자열은 new를 사용하지 않고도 인스턴스가 가능하다. 되도록 new 를 사용하지 말자.
        p1.address = "일산"; // 아래 오류를 바로잡기 위하여 "일산" 으로 선언시 오류 발생하지 않음
        p1.isVip = true;
        //초보자가 가장 실수를 많이 하는 것이 아무것도 참조하지 않은 변수를 사용하는 것이다.
        p2.name = "조조"; // (String은 자주 사용하니 개발자가 "" 만으로 가능하게 만들어줌)
        p2.address = "서울";
        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length()); //  위에서 인스턴스를 참조시키지 않으면 오류가 발생
        System.out.println(p1.isVip);
        System.out.println("------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
