package com.company;

import java.util.Comparator;

/**
 * Created by Dan on 24.10.2015.
 */
public class StudentNameComparator implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof Student && o2 instanceof Student)
        {
            return ((Student)o1).getName().compareTo(((Student)o2).getName());
        }


        return 0;

    }

}

