public class Hello2 {
    static int i;
    static{ // static 블럭은 메인 메서드보다 먼저 사용돤다.
        i=500;
        System.out.println("static block"); //원래는 스태틱 필드를 초기화 한다.
    }
    public static void main(String[] args){
        System.out.println("Hello");
    }
}
//javac Hello2.java
//java Hello2