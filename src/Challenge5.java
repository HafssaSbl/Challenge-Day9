import java.util.LinkedList;

public class Challenge5 {
    public static void reverseLinkedlist(LinkedList<String> tab) {
        int i = 0;
        int end = tab.size() - 1;

        while (i < end) {
            String temp = tab.get(i);
            tab.set(i, tab.get(end));
            tab.set(end, temp);
            i++;
            end--;
        }

    }
    public static void main(String[] args){
        /*
        Create a simple linked list class with the following operations:
        Add a node to the end of the linked list.
        Remove a node from the linked list.
        Find and print the length of the linked list.
        Reverse the linked list.
        Print all elements of the linked list.
        */
        LinkedList<String> s = new LinkedList<>();
        s.add("hiiiiiiiiiiiiii");
        s.add("heeeeeeeeeeeeee");
        s.add("hoooooooooooooooo");
        s.add("haaaaaaaaaaaaaaaaa");
        System.out.println(s);
        System.out.println(s.remove());
        System.out.println(s.size());
        Challenge5.reverseLinkedlist(s);
        System.out.println("Reversed Linked List:");
        System.out.println(s);


    }
}
