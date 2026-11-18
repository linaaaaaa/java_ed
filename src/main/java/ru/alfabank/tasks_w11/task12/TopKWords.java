package ru.alfabank.tasks_w11.task12;

import java.util.*;

public class TopKWords {
    static void main() {
        int K=3;
        Map<String,Integer> freq=new HashMap<>();
        freq.put("java",5);
        freq.put("streams",2);
        freq.put("lambda",4);
        freq.put("jazz",5);
        freq.put("a",1);
        freq.put("b",4);
        freq.put("c",3);
        Comparator<Map.Entry<String,Integer>> comparator=Comparator.comparing(Map.Entry<String,Integer>::getValue).thenComparing(Map.Entry::getKey);
        PriorityQueue<Map.Entry<String,Integer>> queue= new PriorityQueue<>(K,comparator);
        for(Map.Entry<String,Integer> entry:freq.entrySet()){
            queue.add(entry);
            if(queue.size()>K){
                queue.poll();
            }
        }
        Comparator<Map.Entry<String,Integer>> comparatorReversed=Comparator.comparing((Map.Entry<String,Integer> m)->m.getValue()).reversed().thenComparing(Map.Entry::getKey);
        List<Map.Entry<String,Integer>> result=new ArrayList<>(queue);
        result.sort(comparatorReversed);
        System.out.println(result);
    }
}
