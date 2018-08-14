package list.arrayList.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Ram");
        stringList.add("Dam");
        stringList.add("Bam");
        stringList.add("Sam");

        // Synchronised the list
        stringList = Collections.synchronizedList(stringList);

        // While iterating over synchronised list, we must synchronise
        // on it to avoid non deterministic behavior
        synchronized (stringList) {
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}