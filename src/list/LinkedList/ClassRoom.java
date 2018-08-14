package list.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ClassRoom {

    private int id;
    private List<Student> students = new LinkedList<>();

    public ClassRoom(int id, List<Student> students) {
        this.id = id;
        this.students = students;
    }
}