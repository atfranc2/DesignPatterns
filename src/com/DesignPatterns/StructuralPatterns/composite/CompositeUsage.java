package com.DesignPatterns.StructuralPatterns.composite;

public class CompositeUsage {
    public static void Usage(){
        var s1 = new Square();
        var s2 = new Square();

        var c1 = new Circle();
        var c2 = new Circle();

        var group1 = new Group();
        group1.add(s1);
        group1.add(s2);

        var group2 = new Group();
        group2.add(c1);
        group2.add(c2);

        var groups = new Group();
        groups.add(group1);
        groups.add(group2);

        groups.render();

    }
}
