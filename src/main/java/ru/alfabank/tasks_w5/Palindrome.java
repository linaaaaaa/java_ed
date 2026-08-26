package ru.alfabank.tasks_w5;

public class Palindrome {
    public boolean isPalindrome(String s) {
        boolean result = true;
        s = s.replaceAll("[^a-zA-z]", "");
        s = s.toUpperCase();
        if (s.isEmpty() || s.length() == 1) {
            return result;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            s = s.substring(1, s.length() - 1);
            result = this.isPalindrome(s);
        } else {
            result = false;
        }
        return result;
    }

    static void main() {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("0/1"));
        System.out.println(p.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(p.isPalindrome("abca"));
        System.out.println(p.isPalindrome(""));
    }
}
