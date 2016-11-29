import java.util.*;

/**
 * Created by Gil on 16-Nov-16.
 */
public class Main {

    public static void main(String[] args) {

        java.util.List<Student> student1 = new ArrayList<>();
        java.util.List<Student> student2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int m = (int) (Math.random() * 5) + 1;
            Student stud = new Student(m);
            if (i % 2 == 0) {
                student1.add(stud);
            } else if (i%3 == 0) {
                student2.add(stud);
            } else{
                student1.add(stud);
                student2.add(stud);
            }
        }

        List<Student> res = getSame(student1, student2);
        printStudents(res);


    }

    private static List<Student> getSame (List < Student > student1, List < Student > student2){
        List<Student> res = new ArrayList<>();
        for (Student student : student1) {
            if (student2.contains(student)) {
                res.add(student);
            }

        }
        return res;
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getMark());
        }

}

}
