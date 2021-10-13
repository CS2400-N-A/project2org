public class ResizableArrayStackTest {
    public static void main(String[] args) {
        String expression = ""
    
    }
    
    public static String evaluatePostfix(String postfix) {
        StackInterface<Character> vStack = new ResizableArrayStack<Character>();
        int position = 0;
        int end = infix.length()-1;
        String result = "";
        
        while (position<end) {
            Character next = postfix.charAt(position);
            switch(next) {
             case next:
             vStack.push(next);
             break:
             case '+': case'-': case '*': case'/': case '^':
                Character op2 = vStack.pop()
                Character op1 = vStack.pop()
                // result =
                vStack.push(result);
                break;
            default:
            break; // Ignore unexpected characters
            }
            
        }
        return vStack.peek();
    }
    
    
}