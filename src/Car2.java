public abstract class Car2 {
    public Car2(String name){ // 생성자는 return type X (없어야함)
        super(); //자동생성됨.
        System.out.println("Car2() 생성자 호출");
    }

    public abstract void run();
}
