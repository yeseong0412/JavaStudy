public class Main{
    public static void main(String[] args){
        VendingMachine vm1 = new VendingMachine();
        String product = vm1.pushProductButton(100);
        System.out.println(product);
    }
}