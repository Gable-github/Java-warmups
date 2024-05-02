// https://www.w3resource.com/java-exercises/collection/java-collection-exercise-1.php
import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.*;

public class Exercise1 {

    public static <T> void iterate(List<T> ls){
        for(T item: ls) {
            System.out.println(item);
        }
    }

    public static void insertAt0(List<String> ls, String str){
        ls.addFirst(str);
    }

    public static List<Boolean> inLs(List<String> ls, List<String> ls2) {
        List<Boolean> lsIn = new ArrayList<>();
        List<String> longerList = ls.size() >= ls2.size() ? ls : ls2;
        List<String> shorterList = ls.size() < ls2.size() ? ls : ls2;

        Set<String> shorterListSet = new HashSet<>(shorterList);

        for (String item : longerList) {
            lsIn.add(shorterListSet.contains(item));
        }
        return lsIn;
    }

    public static List<String> swap(List<String> ls, int pos1, int pos2) {
        String temp = ls.get(pos1);
        ls.set(pos1, ls.get(pos2));
        ls.set(pos2, temp);
        return ls;
    }

    @SafeVarargs
    public static List<String> addTogether(List<String>... args){
        List<String> finList = new ArrayList<String>();
        for (List<String> ls : args){
            finList.addAll(ls);
        }
        return finList;
    }

    public static List<String> cloneLs(List<String> ls) {
        return new ArrayList<>(ls);
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

//        ls.remove(3);
//
//        System.out.println(ls.get(3));
//
//        Collections.sort(ls);
//
        List<String> ls2 = new ArrayList<String>(Collections.nCopies(ls.size(), null));
        Collections.copy(ls2, ls);
        System.out.println(ls2);

//        Collections.shuffle(ls2);  // different seed each time
//
//        Collections.reverse(ls2);


        System.out.println("list 1 "+ls);
        System.out.println("list 2 "+ls2);
        ls2.add("Blue");
        List<Boolean> lsIn = inLs(ls, ls2);
        System.out.println(lsIn);
//
//        swap(ls, 1, 3);
//        System.out.println(ls);
//        Collections.swap(ls,1, 3); // faster way
//        System.out.println(ls);

//        List<String> finList = addTogether(ls, ls2);
//        System.out.println(finList);

//        List<String> clonedList = cloneLs(ls);
//        System.out.println(clonedList==ls);

//        ls.removeAll(ls);
//        System.out.println(ls);
    }
}
