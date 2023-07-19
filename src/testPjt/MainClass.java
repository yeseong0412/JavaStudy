package testPjt;

public class MainClass {
    public static void main(String[] args){
        Bicycle myBicycle = new Bicycle("red", 1000);
//        myBicycle.color = "red";
//        myBicycle.price = 10000;

        myBicycle.info();
        myBicycle.color = "yellow";

        myBicycle.info();
    }
}
