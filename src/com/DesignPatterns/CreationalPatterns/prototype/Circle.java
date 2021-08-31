package com.DesignPatterns.CreationalPatterns.prototype;

public class Circle implements CloneableComponent {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public CloneableComponent clone() {
        var newCircle = new Circle();
        newCircle.setRadius(radius);

        return newCircle;
    }

    @Override
    public void render() {
        System.out.println("Drawing a circle");
    }

}
