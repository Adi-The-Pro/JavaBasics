import java.util.*;

public class MapClass {

    public static void main(String[] args){
        Map<String, String> marks = new HashMap<>();
        marks.put("Maths", "95");
        marks.put("science", "90");

        for(Map.Entry<String,String> x : marks.entrySet()){
            System.out.println(x);
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
    }
}
