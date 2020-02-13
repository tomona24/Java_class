package basics;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Array - fixed size, a sequence of elements of the same type
        // 1. array literal( initialization)
        int[] arr1 = {1, 2, 3, 4, 5};

        // the length(size) of array
        System.out.println(arr1.length);

        // access element in array
        System.out.println(arr1[0]);  // 1
        System.out.println(arr1[arr1.length -1]);  // last element


        // for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // change the element
        arr1[0] = 7;


        // for-each loop (collections
        for (int elem : arr1) {
            System.out.print(elem);

        }

        // we can't change the size of array after creating it.


        // 2. create an array with the "size"
        // - create a new array object with size 10
        // - by default, it stores zero
        // type[] array = new type[size]
        int[] arr2 = new int[10];  // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = i + 1;
        }
        // arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        // Everything except data of primitive type is "Reference type" = return the address
        System.out.println(arr2);

        // there are 2 ways to show all elements in the array

        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i] + ", ");
        }

        System.out.println();

        // helper method 'util'
        System.out.println(Arrays.toString(arr2));

        String[] countries = new String[2];
        countries[0] = "Canada";
        countries[1] = "Mexico";

        // 3. 1 + 2 combine (malloc)
        String[] countries2 = new String[] {"Canada", "USA"};

        for(String country : countries2) {
            System.out.println(country);
        }

    }
}
