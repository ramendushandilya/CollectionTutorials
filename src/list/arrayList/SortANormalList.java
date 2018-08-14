package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortANormalList {

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(3);
        ages.add(5);
        ages.add(2);
        ages.add(8);
        ages.add(0);
        ages.add(2);

        // Before sorting
        printList(ages);

        Collections.sort(ages);

        // After sorting
        System.out.println("\nAfter sorting");
        printList(ages);
    }

    static void printList(List<Integer> list) {
        for(Integer integer : list) {
            System.out.println(integer);
        }
    }
}
