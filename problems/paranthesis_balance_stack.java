import java.util.*;
public class paranthesis_balance_stack {
    public static void main(String[] args){
        String input = ")()";

        Stack<Character> stack = new Stack<>();
        
        for(Character value : input.toCharArray()){
            if(value == '('){
                stack.push('(');
            }   else if (value == ')'){
                    if(stack.isEmpty()){
                        System.out.println("Not balanced, lacks opening");
                        return;
                    }
                    stack.pop();

            }
        }

        if(stack.isEmpty()){
            System.out.println("Balanced");
        } else{
            System.out.println("not balanced");
        }

    }
    
}