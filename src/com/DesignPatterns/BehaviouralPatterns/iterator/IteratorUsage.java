package com.DesignPatterns.BehaviouralPatterns.iterator;

public class IteratorUsage {
    public static void Usage() {
        var history = new History<Integer>();
        history.push(1);
        history.push(2);
        history.push(3);
        history.push(4);
        history.pop();
        history.pop();


        var histIter = history.createIterator();
        while (histIter.hasNext()) {
            System.out.println(histIter.current());
            histIter.next();
        }
    }
}
