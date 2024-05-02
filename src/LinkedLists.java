import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void iteratePrint(List<String> ls, int pos){
        for (int i = pos; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
    }

    public static void iteratePrint(List<String> ls, boolean reversed){
        List<String> ls_temp = reversed ? ls.reversed() : ls;
        for (String str: ls_temp) {
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        List<String> ls = new LinkedList<String>();
        ls.add("White");
        ls.add("Black");
        ls.add("Blue");

        //iteratePrint(ls, 1);
        //iteratePrint(ls, true);

    }
}
