package com.company;

import java.util.Comparator;

/**
 * Created by Dan on 24.10.2015.
 */
public class StudentNameLenghtComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        int l1, l2;
        l1 = o1.getName().length();
        l2 = o2.getName().length();
        if(l1>l2){
            return 1;

        } else if (l1<l2){
            return -1;
        } else {
            return 0;
        }
    }
}
