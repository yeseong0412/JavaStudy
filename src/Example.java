//public class Example {
//    public static void main(String[] args) {
//        Person kgw = new Person("김건우", 18, "남");
//        Person bsn = new Person("배성은", 17, "여");
//        Person cmh = new Person("신민호", 17, "중성");
//
//        System.out.printf("%s %d %s\n", kgw.name, kgw.age, kgw.gender);
//        System.out.printf("%s %d %s\n", bsn.name, bsn.age, bsn.gender);
//        System.out.printf("%s %d %s\n", cmh.name, cmh.age, cmh.gender);
//        System.out.println(kgw.eat());
//    }
//}
//
//public class Person {
//    String name;
//    int age;
//    String gender;
//
//    public String eat() {
//        return "먹다";
//    }
//
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//}
public class Example{
    public static void main(String[] args) {
        int i=0;
        while (true) { //while(1) 하면 오류남 == 왠진 모름; 낼 찾아봐야지 (너무 늦어서 잘꺼임 2:23;;ㅋㅋ)
            i+=1;
            System.out.println("자바+스프링은 어렵다, 노드는 쓸만하지만 잘 모르겠다. 코틀린 배우고 싶다.");
            if(i==10){
                break;
            }
        }
    }
}