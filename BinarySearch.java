public class BinarySearch {
    public static void main(String[] args) {
        int search = 90;
        int []arr = {56,66,74,77,83,89,90,95};
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == search){
                System.out.println("the element "+ search +" is found at location "+ mid);
                break;
            }
            else if(arr[mid] > search){
                high = mid - 1;
            }
            else if(arr[mid] < search){
                low = mid + 1;
            }
            else{
                System.out.println("The element is not found");
            }
        }
    }
}
