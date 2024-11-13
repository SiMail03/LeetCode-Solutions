import java.util.Stack;


class Solution {
    public boolean isValid(String s) {
        String parent = s;

        Stack <Character> stack = new Stack ();
        int i=0;
        while(i<parent.length ()) {
            char current = parent.charAt (i);
            if(current=='{' || current=='[' || current=='(')
                System.out.println ("Pushed element "+ stack.push(current));

            else if ( !stack.isEmpty () &&
                    (( stack.peek () == ('{')  && current=='}') ||
                            ( stack.peek ()== ('[') && current==']' )||
                            (stack.peek ()== ('(') && current==')'))) {
                System.out.println ("popped element" +  stack.pop ());


            }
            else if (current == '}' || current == ']' || current == ')') {
                System.out.println("False");
                return false;
            }

            i++;
        }


        if(stack.isEmpty ()) {
            System.out.println ("True");
            return true;
        }
        else {
            System.out.println ("False");
            return false;
        }
    }

}


