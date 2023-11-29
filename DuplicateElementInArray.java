import java.util.*;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int []arr = {2,5,8,9,1,2,5};

        // ***********************Using BruteForce**************************************************
        
        System.out.print("Duplicate Elements are :- ");
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + "  " );
                }
            }
        }
        
        // *************************Using Map******************************************************
        
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arrMap.containsKey(arr[i])){
                arrMap.put(arr[i], arrMap.get(arr[i])+1);
            }
            else{
                arrMap.put(arr[i], 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> mapEnt = arrMap.entrySet();
        for(Map.Entry<Integer,Integer> ent : mapEnt){
            if(ent.getValue()>1){
                System.out.println(ent.getKey());
            }
        }

        // *************************Using Set**************************************************

        Set<Integer> arrSet = new HashSet<>();
        for(Integer val : arr){
            if(arrSet.add(val)==false){
                System.out.println(val);
            }
        }

    }
}
