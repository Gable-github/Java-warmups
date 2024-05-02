// https://www.w3resource.com/java-exercises/collection/java-collection-exercise-1.php
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise1 {

    public static <T> void iterate(List<T> ls){
        for(T item: ls) {
            System.out.println(item);
        }
    }

    public static void insertAt0(List<String> ls, String str){
        ls.addFirst(str);
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Red");
        ls.add("Green");
        ls.add("Orange");
        ls.add("White");
        ls.add("Black");
        System.out.println(ls);

        insertAt0(ls, "Pink");
        //iterate(ls);
        ls.set(2, "Yellow");
        System.out.println(ls);

        ls.remove(3);
        System.out.println(ls);

        System.out.println(ls.get(3));

        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);

        List<String> ls2 = new ArrayList<String>(Collections.nCopies(ls.size(), null));
        System.out.println(ls2);

        Collections.copy(ls2, ls);
        System.out.println(ls2);

        Collections.shuffle(ls2);
        System.out.println(ls2); // different seed each time

        Collections.reverse(ls2);
        System.out.println(ls2);
    }
}
