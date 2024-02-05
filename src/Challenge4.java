import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Challenge4 {
    public static void main(String[] args) {
        /*
        Implement a basic queue data structure using an ArrayList.
        The queue should support the following operations:
        Enqueue (add an element to the back of the queue).
        Dequeue (remove the element from the front of the queue).
        Peek (get the element at the front of the queue without removing it).
        Check if the queue is empty.
        */
        System.out.println("/********* Challenge 4: Queue Implementation ***********/");
        Queue<String> q = new LinkedList<>();
        q.add("Rick");
        q.add("Maggie");
        q.add("Glenn");
        q.add("Negan");
        q.add("Daryl");
        System.out.println("List :");
        System.out.println(q);

        System.out.println(q.remove());

        System.out.println(q);

        System.out.println(q.peek());


    }
    }
