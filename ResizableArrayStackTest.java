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
            if ('a' <= next && next <= 'h') {
                switch (next) {
                    case 'a':{
                        vStack.push('2');
                        break;
                    }
                    case 'b':{
                        vStack.push('3');
                        break;
                    }
                    case 'c':{
                        vStack.push('4');
                        break;                       
                    }
                    case 'd':{
                        vStack.push('5');
                        break;
                    }
                    case 'e':{
                        vStack.push('6');
                        break;
                    }
                    case 'h':{
                        vStack.push('7');
                        break;
                    }
                    default: break;
                }
            }
            else {
                Character op2 = vStack.pop();
                Character op1 = vStack.pop();
                switch (next) {
                    case '+': {
                        char result = (char)(op1 + op2);
                        vStack.push(result);
                        break;
                    }
                    case '-': {
                        char result = (char)(op1 - op2);
                        vStack.push(result);
                        break;
                    }
                    case '*': {
                        char result = (char)(op1 * op2);
                        vStack.push(result);
                        break;
                    }
                    case '/': {
                        char result = (char)(op1 / op2);
                        vStack.push(result);
                        break;
                    }
                    case '^': {
                        char result = (char)(op1 ^ op2);
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