import java.util.Stack;

public class Challenge3 {
    public static void main(String[] args) {
      System.out.println("/************ Challenge 3: Stack Implementation **************/");
      /*
      Implement a simple stack data structure using an array.
      The stack should support the following operations:
      Push (add an element to the top of the stack).
      Pop (remove the element from the top of the stack).
      Peek (get the element at the top of the stack without removing it).
      Check if the stack is empty.*/
        Stack<String> strings=new Stack<>();
        strings.push("hiiiiiiiii");
        strings.push("hellooooooo");
        strings.push("goooooooood");

        System.out.println(strings);

        strings.pop();

        System.out.println(strings);

        System.out.println(strings.peek());
    }


}