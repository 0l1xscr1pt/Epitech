import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> theList = new ArrayList<String>();
        for (int i = 0; i < var.length; i++) {
            theList.add(var[i]);
        }
        return theList;
    }
}