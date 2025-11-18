import java.util.*;

public class ListClass {
    public static void main(String[] args){
        //This List Can only store Strings
        List<String> arr  = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i)); //We can't do arr[i] as this isn't a primitive list 
        }

        //Another way
        int[] arr3 = {1,2,3};
        for(int i = 0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }

        //This List can store any type of data
        List<Object> arr2 = new ArrayList<>();
        //Another way
        Object[] arr4 = {1, "Hello", 2.5, true};
        for(int i = 0; i<arr4.length; i++){
            System.out.println(arr4[i]);       
        }

    }    
}
