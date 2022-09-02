package Test2_2Sep2022.Question_One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Operations {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int[] create(int numberOfElements) throws IOException {

        int array[] = new int[numberOfElements];

        System.out.println("Enter your elements : ");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        return array;

    }

    public void display(int array[]) {
        System.out.println("Your Array is as shown below : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void sortArray(int array[]) {
        Arrays.sort(array);
        System.out.println("Sorted Array in Ascending order : ");
        for (int i : array) {
            System.out.println(i + " ");
        }

        System.out.println("Sorted Array in Descending order is : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }

    }

}
