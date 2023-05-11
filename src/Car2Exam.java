public class Car2Exam {
    public static void main(String[] args){
        //Car2 c1 = new Car2("usrstory");
        Bus2 b1 = new Bus2();
        b1.run();
        SportsCar s1 =  new SportsCar("sportsCar!!");
        s1.run(); // 자바는 동적언어다 ( 실행되기 직전까진 실행결과를 아무것도 모른다.)
//        Car2[] arr = new Car2[0];
//        arr[0] = new Bus2();
//        arr[1] = new SportsCar("sportsCar!!");
//        for(Car2 c2 : arr){
//            c2.run();
//        }
    }
}
