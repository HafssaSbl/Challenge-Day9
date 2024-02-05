//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Challenge1 {
    public static void main(String[] args) {

        System.out.println("/********** Challenge 1: Array Operations ****************/");

        /*
        Create a Java program that performs the following operations on an array of integers:
        Initialize an array with values.
        Find and print the sum of all elements in the array.
        Find and print the maximum and minimum values in the array.
        Reverse the array and print the reversed version.
        */

        int[] numbers = {5,8,7,4,1,9};
        int sum =0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println("the sum of all elements in the array : "+sum);

        int max = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("the maximum values in the array : "+max);

        int min = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("the minimun values in the array : "+min);


        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}