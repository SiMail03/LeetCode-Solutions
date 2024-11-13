import java.util.Stack;

public class Main {
    public static void main (String[] args) {
        String parent = "{{}[[]]}";

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
                return;
            }

            i++;
        }


        if(stack.isEmpty ()) {
            System.out.println ("True");
        }
        else {
            System.out.println ("False");
        }
    }
}