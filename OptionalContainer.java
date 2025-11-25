import java.util.*;

public class OptionalContainer {

    public static void main(String[] args){
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Maths", 95);

        //Optional is a container object which may or may not contain a non-null value.
        Optional<Integer> nullMarks = Optional.ofNullable(marks.get("science"));
        if(nullMarks.isPresent()){
            System.out.println("Science marks: " + nullMarks.get());
        } else {
            System.out.println("Science marks are not available.");
        }
    }
}
