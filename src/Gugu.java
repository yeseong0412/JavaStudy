import java.util.Scanner;

public class Gugu {
    public static void main(String[] args){
        for ( ; ; ) { //무한반복
            System.out.println("1부터 9까지 수를 입력하시오");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            if(data < 10) {
                for(int i=1; i<10; i++) {
                    System.out.println(data + "*" + i + "=" + data * i);
                }
                break; // 계산 다 했을때 정지
            }
            else {
                System.out.println("1부터 9까지 수를 다시 입력해주세요.");
                continue; //만약 data 값이 1~9 가 아니라면 다시 for를 돌리기 위한 구문
            }
        }
    }
}
