public class CarExam01 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송(); //한글로도 된다.
        Car c1 = new Bus(); // Bus == Car
        c1.run();
        Bus b2 = (Bus)c1;
        b2.안내방송();
        Car c2 = new SuperCar();
        c2.run();
    }
}
