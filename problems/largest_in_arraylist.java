import java.util.*;

public class largest_in_arraylist {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(30);
        num.add(20);
        num.add(4);
        num.add(5);

        Collections.sort(num);

        System.out.println("Second largest element: " + num.get(num.size()-2));



    }
}
