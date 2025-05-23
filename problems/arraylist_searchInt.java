import java.util.Scanner;
import java.util.ArrayList;

public class arraylist_searchInt {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

       
        if(num.contains(input)){
            System.out.println("present");
        } else{
            System.out.println("not present");
        }
    }
}
