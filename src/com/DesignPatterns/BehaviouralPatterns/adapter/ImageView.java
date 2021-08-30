package com.DesignPatterns.BehaviouralPatterns.adapter;

public class ImageView {

    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void render(Filter filter) {
        filter.apply(image);
    }
}
