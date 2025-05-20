import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class TreeNode {
    int data;
    TreeNode left, right; //references to another object. int left is primitive data type, but TreeNode left is a reference type that can point to an object

    // constructor. It's called when we create an object using new
    TreeNode(int item){
        data = item;
        left = right = null;
    }
    
}

public class dsa {
    public static void main(String[] args){

        // Arrays
        // Should consist of similar data type, fixed size and cannot be modified later

        // init empty array of 5 int filled with 0's
        int[] arr1 = new int[5]; 
        arr1[0] = 10;
        for (int i=0; i<5; i++){
            System.out.println(arr1[i]);
        }

        // line break
        System.out.println();

        // array initialized with ints
        int[] arr2 = {10,20,30,40,50};

        for (int i=0; i<5; i++){
            System.out.println(arr2[i]);
        }

        // print array length
        System.out.println("Length of array2 : "+ arr2.length);

        System.out.println();

        // ArrayList
        //ArrayList is a resizable array from the java.util package. 
        //Unlike regular arrays, ArrayList can grow or shrink in size dynamically.

        // String can be replaced with any data types, fruits is the name of the array list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Fruits size: " + fruits.size());

        System.out.println();

        // LinkedList
        // Consists of nodes that store data and references to the next and previous nodes (in a doubly linked list)
        // It is efficient for insertion and deletion at the start and end of the list

        LinkedList<Double> prices = new LinkedList<>();
        prices.add(99.99);
        prices.add(57.74);
        prices.add(64.96);

        prices.addFirst(50.01);

        System.out.println("First price: " + prices.getFirst());
        System.out.println("Last price: " + prices.getLast());

        System.out.println();

        //HashMap
        //a is a key-value data structure where:
        //Each key is unique, Each key maps to exactly one value 
        //Lookup, insert, delete operations are generally very fast

        HashMap<String, String> AgentsRoles = new HashMap<>();
        AgentsRoles.put("Jett", "Duelist");
        AgentsRoles.put("Omen", "Controller");
        AgentsRoles.put("Sage", "Sentinel");

        System.out.println("Role of Omen: " + AgentsRoles.get("Omen"));

        System.out.println();

        // Stack
        // A Stack is a LIFO (Last In, First Out) data structure — the last element you push in is the first to be popped out.
        // Used in operations like backtracking like undo
        // You can only add or remove values to/from top of the stack
        //add() to add, pop() to remove

        Stack<Character> stack = new Stack<>();
        stack.add('A');
        stack.add('B');
        stack.add('C');

        // Peek lets us to view the top element without removing it
        System.out.println("First Char of the stack: " + stack.peek());
        stack.pop();
        System.out.println("First element after pop: " + stack.peek());

        System.out.println();

        // Queue
        // A Queue is a FIFO (First In, First Out) data structure — the first element added is the first one to be removed.
        // Elements are added from the rear and removed from the front
        // Ideal for managing tasks and process requests in sequential manner 
        // offer() to add, poll() to remove

        Queue<String> customers = new LinkedList<>();
        customers.offer("Otis");
        customers.offer("Maeve");
        customers.offer("Eric");

        System.out.println("Next customer: " + customers.poll());
        System.out.println("Now serving: " + customers.peek());

        System.out.println();

        //Trees
        //A Tree is a data structure made of nodes connected by edges with the following properties:
        //One node is the root (top of the tree), Every node (except root) has exactly one parent, Nodes can have zero or more children.
        //Binary Tree: Each node has at most two children (left and right)
        //Class TreeNode is already defined above main class

        // Creates an object called root of class Treenode with item 10
        TreeNode root = new TreeNode(10);

        // Creates another object of class TreeNode and assigns it to the references left, right
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);

        System.out.println("Root: " + root.data);
        System.out.println("Left child of root: " + root.left.data);
        System.out.println("Right child of root: " + root.right.data);

    }
}


