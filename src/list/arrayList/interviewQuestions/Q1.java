package list.arrayList.interviewQuestions;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Q1 {

    public static void main(String[] args) {
        List<Integer> ages = new LinkedList<>();
        ages.add(3);
        ages.add(3);
        ages.add(2);
        ages.add(3);
        ages.add(3);
        ages.add(3);
        ages.add(5);

        Set<Integer> uniqueAges = new LinkedHashSet<>();
        uniqueAges.addAll(ages);

        ages.clear();
        ages.addAll(uniqueAges);

        System.out.println("Duplicates removed");

        ages.forEach(n -> System.out.println(n));
    }
}