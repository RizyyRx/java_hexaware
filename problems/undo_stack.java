import java.util.*;

public class undo_stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Type: ");
            String input = scanner.nextLine();

            if(input.equals("undo") && !stack.isEmpty()){
                stack.pop();
            } else if(input.equals("exit")){
                break;
            } else {
                stack.push(input);
            }
        }

        System.out.println(String.join(" ", stack));
        
    }    
}
