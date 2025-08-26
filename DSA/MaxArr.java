public class MaxArr{
    public static void main(String[] args) {
        int[] arr = {23,53,2,45,12};
         int max = arr[0];
        // System.out.println(arr.length);
        
        for(int i=0; i<arr.length; i++){
            // System.out.println(arr[i]);
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}