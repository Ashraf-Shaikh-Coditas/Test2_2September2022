package Test2_2Sep2022.Question_One;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuDrivenMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;

        System.out.println("Enter the number of elements to be added :: ");
        int numberOfElements = Integer.parseInt(bufferedReader.readLine());

        int array[] = new int[numberOfElements];

        System.out.println("1. Create Array.");
        System.out.println("2. Fetch Array.");
        System.out.println("3. Sort Array.");
        System.out.println("4. Exit.");


        while (flag) {
            System.out.print("\nEnter your choice :: ");
            int choice = Integer.parseInt(bufferedReader.readLine());

            Operations operations = new Operations();


            switch (choice) {
                case 1:
                    array = operations.create(numberOfElements);
                    break;

                case 2:
                    operations.display(array);
                    break;

                case 3:
                    operations.sortArray(array);
                    break;

                default:
                    flag = false;
            }
        }
    }
}
