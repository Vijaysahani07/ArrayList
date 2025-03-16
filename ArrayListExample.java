import java.util.*;

public class ArrayListExample {

    public static void main (String[] args){

        System.out.println("Hello This is your Class Subject");

        ArrayList<String> subjectName = new ArrayList<>();

        //Adding the subject name 
        subjectName.add("Maths");
        subjectName.add("Science");
        subjectName.add("Hindi");
        subjectName.add("English");
        subjectName.add("History");

        subjectName.add(0, "Sanskrit");

        System.out.println("Those subject shall we teach in class: " + subjectName);
    }
}