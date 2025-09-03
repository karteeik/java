import java.util.*;
public class SecondLargeElem {
    public static void main(String[] args) {
        Integer[] arr = {1,2,5,39,2,34};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[1]);
    }
}
