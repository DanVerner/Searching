package search;

import static java.util.Collections.max;
import static java.util.Collections.min;

/**
 * Created by Denis on 12.04.2017.
 */
public class Search {
    private double SECOND = 1000.0;

    private long startTime;
    private long endTime;
    private long overallTime;

    public void findMinAndMax(){
        startTime = System.currentTimeMillis();

        int minimum = min(List.list);
        int maximum = max(List.list);

        endTime = System.currentTimeMillis();
        overallTime = endTime - startTime;
        double printTime = overallTime/SECOND;

        System.out.println("Минимум и максимум найдены за: " + printTime + " сек");
        System.out.println("Минимальное число в массиве: " + minimum);
        System.out.println("Максимальное число в массиве: " + maximum);
    }
}
