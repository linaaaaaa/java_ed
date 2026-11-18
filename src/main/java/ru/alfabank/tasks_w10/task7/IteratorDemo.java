package ru.alfabank.tasks_w10.task7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    static void main() {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
//        test incorrect way of collection items removal
//        for (int n:nums){
//            if ((n%2)==0){
//                nums.remove(n);
//            }
//        }
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(nums);
    }
}
