package search;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.min;

/**
 * Created by Denis on 12.04.2017.
 */
public class List {
    private final int CURRENCY = 1000000000;
    private final int COUNT = 20000000;
    private final double SECOND = 1000.0;

    private long startTime;
    private long endTime;
    private long overallTime;

    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public void addToList(){
        startTime = System.currentTimeMillis();

        Random rand = new Random();
        for(int i = 0; i < COUNT; i++){
            list.add(rand.nextInt(CURRENCY));
        }

        endTime = System.currentTimeMillis();
        overallTime = endTime - startTime;
        double printTime = overallTime/SECOND;
        System.out.println("Массив заполнен за: " + printTime + " сек");
        System.out.println("Done");

        Search search = new Search();
        search.findMinAndMax();
    }
}
