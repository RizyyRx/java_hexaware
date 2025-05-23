import java.util.*;
public class test {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }

        System.out.println();

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

    }
}
