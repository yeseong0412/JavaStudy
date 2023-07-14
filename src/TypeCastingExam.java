public class TypeCastingExam {
    public static void main(String[] args){
        int x = 50000;
        long y = x;
        long x1 = 5;
        // int y1 = x1; 형변환 해줘야함 안하면 오류
        int y1 = (int) x1;
        System.out.println(y1 + y);
    }
}
