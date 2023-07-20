package proj;

public class MainClass {
    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        obj1.getInfo();

        obj1 = null; //레퍼런스 x
        //obj1.getInfo();

        obj2.getInfo();

    }
}