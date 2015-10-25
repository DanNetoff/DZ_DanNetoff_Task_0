package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(3,"Danil","050");
        Student student2 = new Student(2,"Ant","095");
        Student student3 = new Student(1,"Buka","063");

        final Student[] student;
        student = new Student[]{student1,student2,student3};


        for (Student myStudent : student)
        {
            System.out.println(myStudent.toString());

        }

        Arrays.sort(student);
        Arrays.sort(student,new StudentNameLenghtComparator());


        for (Student myStudent : student)
        {
            System.out.println(myStudent.toString());

        }

    final int i = 1;


    }
}
