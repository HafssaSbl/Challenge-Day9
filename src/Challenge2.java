import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {


        /*
        Create a Java program that uses ArrayList to perform the following operations:
        Initialize an ArrayList with some String values.
        Add a new element to the end of the ArrayList.
        Remove an element from the ArrayList.
        Check if a specific element exists in the ArrayList.
        Print all elements of the ArrayList.
        */

        System.out.println("/************ Challenge 2: List Manipulation ***********/");

        ArrayList<String> names = new ArrayList<>();
        names.add("Hafssa");
        names.add("Safae");
        names.add("Salwa");
        names.add("Amal");

        System.out.println(names);

        names.remove(0);

        System.out.println(names);

        String searchElement = "Amal";
        if (names.contains(searchElement)){
            System.out.println(searchElement+" is present in the ArrayList.");
        }else{
            System.out.println(searchElement+" is not present in the ArrayList.");
        }

        System.out.println("All elements of the ArrayList : "+names);


    }

}
