// import java.util.*;
public class IsArrSort {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 17, 2, 7, 3 };
        // int [] arr1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
