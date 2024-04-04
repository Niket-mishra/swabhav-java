package com.aurionpro.test;

import com.aurionpro.model.BubbleSortStrategy;
import com.aurionpro.model.QuickSortStrategy;
import com.aurionpro.model.SortingContext;
import com.aurionpro.model.SortingStrategy;

public class StrategyTest {

    public static void main(String[] args) {
        SortingContext s = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        s.performSort(array1);
        s.setSortingStrategy(new QuickSortStrategy());
        s.performSort(array1);
    }
}
