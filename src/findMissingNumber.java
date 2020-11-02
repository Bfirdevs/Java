import java.util.Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){

        Arrays.sort(arr);
        for(int i=0; i<= arr.length; i++){
            if(arr[i] != i +1){
                return i+1;

            }
        }
        return 10;
    }
}
