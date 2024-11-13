import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack stack = new Stack();
        String reversedWord = new String ();

        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)==' ') {
                while(stack.size () != 0) {
                    reversedWord = reversedWord + stack.pop ();
                }
                reversedWord = reversedWord + ' ';
            }
            else {
                stack.push (s.charAt (i));
            }


        }
        while(stack.size () != 0) {
            reversedWord = reversedWord + stack.pop ();
        }
        return reversedWord;
    }
}