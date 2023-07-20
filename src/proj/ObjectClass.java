package proj;

import javax.swing.text.html.ObjectView;

public class ObjectClass {
    public int x;
    public int y;
    public ObjectClass(String hello, int[] iArr) {
        System.out.println("-- ObjectClass() --");

        System.out.println("s --> " + hello);
        System.out.println("iArr --> " + iArr);
    }
    public ObjectClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void getInfo(){
        System.out.println("x -> " + x);
        System.out.println("y -> " + y);
    }
}
