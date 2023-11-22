package crazySort;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class crazySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<len; i++){
            list.add(scanner.nextInt());
        }
        sortMain sortMain = new sortMain(len, list);
    }
}
