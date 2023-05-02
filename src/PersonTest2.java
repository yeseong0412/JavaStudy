public class PersonTest2 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p2.name = "조조";
        System.out.println(Person.count);
        //static 필드를 클래스 변수라고 말할때도 있다.
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);

        System.out.println(Person.count);
    }
}
