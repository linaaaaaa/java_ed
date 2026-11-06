package ru.alfabank.tasks_w11.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapFilter_NoStream {
    static <T,R> List<R> map(List<T> src, Function<? super T,? extends R> f){
        List<R> res=new ArrayList<>();
        for(T t:src){
            res.add(f.apply(t));
        }
        return res;
    }

    static <T> List<T> filter (List<T> src, Predicate<? super T> p){
        List<T> res=new ArrayList<>();
        for (T t:src){
            if(p.test(t)){
                res.add(t);
            }
        }
        return res;
    }

    static void main() {
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(map(nums,x->x*x));
        System.out.println(filter(Arrays.asList("one","two","three"),w->w.length()==3));
    }
}
