public class ResizableArrayStackTest {
    public static void main(String[] args) {
        String expression = "ab*ca-/de*+";
        System.out.println(evaluatePostfix(expression)); 
    }
    
    public static String evaluatePostfix(String postfix) {
        if (postfix.equals(null))
            return null;
        StackInterface<String> vStack = new ResizableArrayStack<String>();
        int position = 0;
        int end = postfix.length()-1;
        
        while (position<end+1) {
            char next = postfix.charAt(position);
            if ('a' <= next && next <= 'h') {
                switch (next) {
                    case 'a':{
                        vStack.push("2");
                        System.out.println("2");
                        break;
                    }
                    case 'b':{
                        vStack.push("3");
                        System.out.println("3");
                        break;
                    } 
                    case 'c':{
                        vStack.push("4");
                        System.out.println("4");
                        break;                       
                    }
                    case 'd':{
                        vStack.push("5");
                        System.out.println("5");
                        break;
                    }
                    case 'e':{
                        vStack.push("6");
                        System.out.println("6");
                        break;
                    }
                    case 'h':{
                        vStack.push("7");
                        System.out.println("7");
                        break;
                    }
                    default: break;
                }
            }
            else {
                String op2 = vStack.pop();
                String op1 = vStack.pop();
                System.out.println(op2);
                System.out.println(op1);
                switch (next) {
                    case '+': {

                        int num = (Integer.parseInt(op1) + Integer.parseInt(op2));
                        String result = Integer.toString(num);
                        vStack.push(result);
                        System.out.println(op1 + "+" + op2+ "=" +num);
                        break;
                    }
                    case '-': {
                        int num = (Integer.parseInt(op1) - Integer.parseInt(op2));
                        String result = Integer.toString(num);
                        vStack.push(result);
                        System.out.println(op1 + "-" + op2 + "=" +num);
                        break;
                    }
                    case '*': {
                        int num = (Integer.parseInt(op1) * Integer.parseInt(op2));
                        String result = Integer.toString(num);
                        vStack.push(result);
                        System.out.println(op1 + "*" + op2+ "=" +num);
                        break;
                    }
                    case '/': {
                        int num = (Integer.parseInt(op1) / Integer.parseInt(op2));
                        String result = Integer.toString(num);
                        vStack.push(result);
                        System.out.println(op1 + "/" + op2+ "=" +num);
                        break;
                    }
                    case '^': {
                        int num = (int)(Math.pow(Integer.parseInt(op1), Integer.parseInt(op2)));
                        String result = Integer.toString(num);
                        vStack.push(result);
                        System.out.println(op1 + "^" + op2+ "=" +num);
                        break; 
                    }
                    default: 
                        break; // Ignore unexpected characters
                }             
            }
            position++;
        }
        return vStack.peek();
    }                  
}