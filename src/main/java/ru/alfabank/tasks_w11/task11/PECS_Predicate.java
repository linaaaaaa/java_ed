package ru.alfabank.tasks_w11.task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PECS_Predicate {
    static <T> int copyIf(List<? super T> dst, List<? extends T> src, Predicate<? super T> p){
        int copiedIf=0;
        for(T t:src){
            if(p.test(t)){
                dst.add(t);
                copiedIf+=1;
            }
        }
        return copiedIf;
    }

    static void main() {
        List<Number> dst=new ArrayList<>();
        List<Integer> src=new ArrayList<>(Arrays.asList(1,2,3,4));
        int n=copyIf(dst,src,x->x%2==0);
        System.out.println(n);
        n=copyIf(dst,new ArrayList<>(),x->x.intValue()%2==0);
        System.out.println(n);
    }
}
