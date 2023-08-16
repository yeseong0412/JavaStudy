package com.bind;


import java.io.*;
import java.util.HashMap;

public class Member {
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    // 저장
    public void save(String name, int Number) {
        map.put(name,Number);
    }
    // 데이터 갯수와 저장된 값 보여주기
    public void showList(){
        System.out.println("현재 등록된 데이터 개수 : " + map.size());
        for( String key : map.keySet() ){
            Integer value = map.get(key);
            System.out.println(String.format("[ " + key + " - " + value + " ]"));
        }
    }
    // 값 검색
//    public void search(String nameSearch){
//        map.containsKey
//    }


    // 파일에 값 저장
    public void txtOut() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("/Users/dgsw8th30/Desktop/Study/JavaStudy/number.txt");
        for( String key : map.keySet() ){
            Integer value = map.get(key);
            String data = "[ " + key + " - " + value + " ]";
            pw.write(data);
        }
    }
}
