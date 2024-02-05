import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.binarySearch;

public class Challenge6 {
    public static void main(String[] args){
    /*
    Implement a binary search algorithm to find the index of a given element in a sorted array.
    The program should print the index if the element is found or indicate
    if it's not present in the array.
    */


        System.out.println("****************  Challenge 6: Binary Search ******************* ");

        ArrayList<Integer> sortedList=new ArrayList<>();
        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(2);

        Collections.sort(sortedList);

        int targetValue = 3;
        int result = binarySearch(sortedList, targetValue);

        if (result != -1) {
            System.out.println("La valeur " + targetValue + " a été trouvée à l'index " + result);
        } else {
            System.out.println("La valeur " + targetValue + " n'a pas été trouvée dans la liste.");
        }




}
}
