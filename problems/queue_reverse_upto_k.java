import java.util.*;
public class queue_reverse_upto_k {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 3;
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("queue before operation: " + q);

        reverseQ(q,k);

        System.out.println("queue after operation: " + q);

    }
    
    public static void reverseQ(Queue<Integer> queue, int k){

        if(queue == null || k>queue.size() || k<=0){
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // elements upto k is taken from queue and pushed to stack
        //q=[40,50]
        //stack=[10,20,30]
        for(int i=0; i<k; i++){
            stack.push(queue.poll()); 
        }

        //stack is emptied by poping and adding back to queue
        // since we put elements into stack and popped back, they will be reversed
        //q=[40,50,30,20,10]

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        //To put the remaining elements to the back of the queue(after the reversed potion)
        //We take them out of the queue and add them back
        //this loop runs queue.size() - k times to just remove the remaining elements and add back to the queue
	    for(int i =0; i< queue.size()-k ;i++){
	        queue.offer(queue.poll());
	    }

    }
}
