package mission;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by nehad on 28/7/18.
 */
class Student implements Comparable<Student>{
    int id;
    String name;
    String section;

    public Student(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}

class Student2 {
    int id;
    String name;
    String section;

    public Student2(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }


    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}

public class Misc {
    public static void main(String[] args)
    {
        Set<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(10);
        set.add(12);

        System.out.println("set is : " + set);


        set = new LinkedHashSet<>();
        set.add(15);
        set.add(10);
        set.add(12);

        System.out.println("set is : " + set);


        Set<Student> students = new TreeSet<>();
        students.add(new Student(11, "neha", "A"));
        students.add(new Student(2, "ashu", "B"));
        students.add(new Student(5, "parth", "C"));

        System.out.println("Students are : " + students);

        Set<Student2> students2 = new LinkedHashSet<>();
        students2.add(new Student2(11, "neha", "A"));
        students2.add(new Student2(2, "ashu", "B"));
        students2.add(new Student2(5, "parth", "C"));

        System.out.println("Students2 are : " + students2);
    }
}
