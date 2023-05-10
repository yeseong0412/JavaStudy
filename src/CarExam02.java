public class CarExam02 {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1); //println(Object x) - Object 를 참조할 수 있는건 다 받아드릴 수 있다.
        c1.printName();
        System.out.println("-----------------------------------------");
        Car c2 = new Car("urstory");
        c2.printName();
    }
}
// 부모타입의 변수로 자식인스턴스를 참조할 수 있다.
// 조상타입의 변수로 후손인스턴스를 참조할 수 있다.
// Car c1 = new Bus(); //not error Why? Bus는 Car을 참조하기 때문.
// Object o1 = new Car();
// Object o2 = new Bus();
// Object o3 = new 이층버스();
// System.out.println(o1.toString()); == System.out.println(o1);