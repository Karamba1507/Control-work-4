package com.company;

import java.util.Comparator;

public class CatAverageLevelComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o2.getAverageLevel(), o1.getAverageLevel());

    }
}
