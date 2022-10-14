import java.util.Scanner;

public class LinearSearch{

    public static void main(String[] args) {

        int numberOfElements, searchElement, arr[];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");

        numberOfElements = scanner.nextInt();
        arr = new int[numberOfElements];

        System.out.print("Enter the " + numberOfElements + " elements: ");

        for(int i = 0; i < numberOfElements; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the search value: ");
        searchElement = scanner.nextInt();

        int index = linearSearch(arr, searchElement);
        if(index != -1)
            System.out.println(searchElement + " found at index " + index);
        else
            System.out.println(searchElement + " not found in the array");
        scanner.close();
    }

    public static int linearSearch(int[] arr, int search){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }


}