package ru.alfabank.tasks_w11.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnaryOperatorTest {
    static void main() {
        List<Integer> nums=new ArrayList<>(Arrays.asList(-3,0,2,5));
        nums.replaceAll(x->{if(x<0){return 0;}
            if(x%2==0){return x*x;}
            return x;
        });
        System.out.println(nums);
    }
}
