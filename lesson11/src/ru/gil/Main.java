package ru.gil;

import java.util.*;

public class Main {

    private static Map<String, Integer> top = new HashMap<>();

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
//        printStudents(res);

        Map<Integer, List<Student>> ratings = getRating(student1);
//        System.out.println(ratings);
          printStudents(ratings);

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

    private static Map<Integer, List<Student>> getRating(List<Student> students) {
        Map<Integer, List<Student>> res = new HashMap<>();
        for (Student student: students
             ) {
            Integer rating = student.getMark();
            if (!res.containsKey(rating)) {
                List<Student> studentList = new ArrayList<>();
                studentList.add(student);
                res.put(rating, studentList);
            } else {
                List<Student> studentList = res.get(rating);
                studentList.add(student);
            }
        }
        return res;
    }

    private static void printStudents(Map<Integer, List<Student>> students) {
        Integer maxRating = 0;
        for (Integer rating : students.keySet()
             ) {
            if (rating > maxRating) maxRating = rating;
        }

        while (maxRating != 0) {
            if (students.containsKey(maxRating)) {
                System.out.println(maxRating + " : ");
                for (Student student : students.get(maxRating)
                        ) {
                    System.out.println(student);
                }
                System.out.println("=============================");
                maxRating--;
            }
        }

    }

    private static void parse(String str) {

        String[] strs = str.replace(".", " ")
                .replace(",", " ")
                .replace("!", " ")
                .replace("?", " ")
                .toUpperCase()
                .split(" ");
        for (String s : strs
             ) {
            Integer count;
            if ((count == top.get(s)) != null) {
                count++;
            } else {
                top.put(s, 1);
            }
        }
    }

}

