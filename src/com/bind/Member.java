package com.bind;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
    HashMap<String, Integer> map = new HashMap<>();

    // 값 저장 로직
    public void save(String name, int Number) {
        if (!check(Number)) {
            map.put(name,Number);
        }
        else {
            System.out.println("전화번호가 이미 존재합니다.");
        }
    }
    // 중복값 체크 로직
    public boolean check(int Number) {
        for (int v : map.values()) {
            if (v == Number) {
                return true;
            }
        }
        return false;
    }
    // 데이터 갯수와 저장된 값 보여주기
    public void showList(){
        System.out.println("현재 등록된 데이터 개수 : " + map.size());
        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort(String::compareTo);
        for (String key : keyList) {
            System.out.println("[ " + key + " - " +  map.get(key) + " ]" );
        }
    }

    // 값 검색
    public void search(String nameSearch) {
        int cnt = 0;
        String[] arr = new String[100]; // 배열 크기 임시설정

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            if (name.contains(nameSearch)) {
                arr[cnt] = "[" + name + " - " + entry.getValue() + "]";
                cnt++;
            }
        }

        System.out.println("검색 결과 개수: " + cnt + "개");
        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[i]);
        }
    }


    // 파일에 값 저장
    public void txtOut() throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("number.txt"));
        for(String key : map.keySet() ){
            Integer value = map.get(key);
            String data = "[ " + key + " - " + value + " ]\n";
            writer.write(data);
        }
        writer.flush();
        writer.close();
    }
}
