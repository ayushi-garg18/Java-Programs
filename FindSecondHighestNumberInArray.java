import java.util.Arrays;

public class FindSecondHighestNumberInArray {
    public static void main(String[] args) {
        int []arr = {2,5,3,1,8,4,9};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for( int i = 0 ; i < arr.length ; i++){
            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }
            if(arr[i] < highest && arr[i] > secondHighest){
                secondHighest = arr[i];
            }
        }
        System.out.println("Second Highest Number is:- " +secondHighest);
    }

}
