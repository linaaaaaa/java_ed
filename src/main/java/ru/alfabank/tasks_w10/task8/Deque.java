package ru.alfabank.tasks_w10.task8;

import java.util.ArrayDeque;

public class Deque {
    boolean isBalanced(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                deque.addFirst(ch);
                continue;
            }
            if (deque.peek() == null)
                continue;
            if (ch == ')') {
                if (deque.peek() == '(') {
                    deque.pollFirst();
                }
            }
            if (ch == '}') {
                if (deque.peek() == '{') {
                    deque.pollFirst();
                }
            }
            if (ch == ']') {
                if (deque.peek() == '[') {
                    deque.pollFirst();
                }
            }
        }
        return deque.isEmpty();
    }

    static void main() {
        Deque deque = new Deque();
        System.out.println("{[gg]}->" + deque.isBalanced("{[gg]}"));
        System.out.println("{[}->" + deque.isBalanced("{[}"));
        System.out.println("->" + deque.isBalanced(""));
    }
}
