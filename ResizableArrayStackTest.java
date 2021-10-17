public class ResizableArrayStackTest {
    public static void main(String[] args) {
        String expression = "ab/c*deh^+-";
        System.out.println(evaluatePostfix(expression));
         
    }
    
    public static Character evaluatePostfix(String postfix) {
        if (postfix.equals(null))
        return null;
        StackInterface<Character> vStack = new ResizableArrayStack<Character>();
        int position = 0;
        int end = postfix.length()-1;
        
        while (position<end) {
            Character next = postfix.charAt(position);
            if ('0' <= next && next <= '9') 
                vStack.push(next);
            else {
                Character op2 = vStack.pop();
                Character op1 = vStack.pop();
                switch (next) {
                    case '+': {
                        char result = op1 + op2;
                        vStack.push(result);
                        break;
                    }
                    case '-': {
                        char result = op1 - op2;
                        vStack.push(result);
                        break;
                    }
                    case '*': {
                        char result = op1 * op2;
                        vStack.push(result);
                        break;
                    }
                    case '/': {
                        char result = op1 / op2;
                        vStack.push(result);
                        break;
                    }
                    case '^': {
                        char result = op1 ^ op2;
                        vStack.push(result);
                        break; 
                    }
                    default: break; // Ignore unexpected characters
                    }
                }                   
        }
        return vStack.peek();
    }                  
}