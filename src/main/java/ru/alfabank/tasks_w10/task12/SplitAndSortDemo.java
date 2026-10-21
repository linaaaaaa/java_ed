package ru.alfabank.tasks_w10.task12;

import ru.alfabank.Utils;

import java.util.Map;

public class SplitAndSortDemo {
    static void main() {
        System.out.print("enter int K: ");
        int K = Utils.ReadFromConsole.readPosInt();
        for (Map.Entry<String, Integer> m : SplitAndSort.splitAndSort("java  and,java3collections")) {
            if (K <= 0) break;
            System.out.println(m);
            K -= 1;
        }
    }
}
