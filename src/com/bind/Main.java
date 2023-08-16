package com.bind;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Member member = new Member();
        while (true) {
            System.out.println("1. 저장하기");
            System.out.println("2. 목록 출력하기");
            System.out.println("3. 이름으로 검색하기");
            System.out.println("4. 프로그램 종료하기");
            System.out.println("5. 목록 내보내기");

            System.out.print("번호 입력 : ");
            int n = sc.nextInt();
            // 저장
            if (n == 1) {
                System.out.print("이름 입력 : ");
                String name = sc.next();
                System.out.print("전화번호 입력 : ");
                int phoneNumber = sc.nextInt();

                member.save(name,phoneNumber);
            }
            // 저장된 값 보여주기
            else if (n == 2){
                member.showList();
            }
            // 이름검색
            else if (n == 3){
                System.out.print("이름 입력 : ");
                String nameSearch = sc.next();
                member.search(nameSearch);
            }
            // 프로그램 종료
            else if (n == 4) {
                System.out.println("프로그램을 종료합니다...");
                System.exit(0);
            }
            // 파일로 저장
            else if (n == 5) {
                System.out.println("전화번호 목록을 내보냅니다...");
                member.txtOut();
            }


        }
    }
}

