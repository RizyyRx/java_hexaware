import java.util.*;

public class linkedlist_addnodeatend {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.addLast(10);

        System.out.println(list);
    }    
}
