public class LinkedStackTest {
    public static void main(String[] args) {
        String infixExpression = "a*b/(c-a)+d*e";
        System.out.println((convertToPostFix(infixExpression)));
    }

    private static String convertToPostFix(String infix){
    	if(infix.equals(null)) {
    		return null;
    	}
    	int position = 0;
    	int end = infix.length()-1;
    	String ans = "";
    	Character current = infix.charAt(0);
    	StackInterface<Character> stackOperator = new LinkedStack<Character>();
    	while(position<=end) {
    		current = infix.charAt(position); 
    		switch(current) {
    			case '^':
    				stackOperator.push(current);
    				break;
    			case '+':
    			case '-':
    			case '*':
    			case '/':
    				while(!stackOperator.isEmpty() && stackOperator.peek()!='(' && operatorPriority(current) >= operatorPriority(stackOperator.peek())) {
    					ans+=stackOperator.pop();
    				}
    				stackOperator.push(current);
    				break;
    			case '(':
    				stackOperator.push(current);
    				break;
    			case ')':
    				while(stackOperator.peek()!='(') {
    					ans+=stackOperator.pop();
    				}
    					stackOperator.pop();
    				break;
    			default:
    				if(Character.isLetter(current)) {
    					ans+=current;
    				}
    				break;
    		}
    		position++;
    	}
    	while(!stackOperator.isEmpty()) {
    		ans+=stackOperator.pop();
    	}
    	return ans;
    }
    
    private static int operatorPriority(char operator) {
    	if(operator == '*' || operator == '/')
    		return 0;
    	else
    		return 1;
    }
}
