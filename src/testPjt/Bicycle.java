package testPjt;

public class Bicycle {
    public String color;
    public int price;
    public Bicycle(){
        System.out.println("Bicycle constructor - I");
    }
    public Bicycle(String c, int p){
        System.out.println("Bicycle constructor - II");
        this.color = c;
        this.price = p;
    }
    public void info(){
        System.out.println(" --info-- ");
        System.out.println("color : " + color);
        System.out.println("price : " + price);
    }

}
