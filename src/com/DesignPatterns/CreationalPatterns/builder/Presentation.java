package com.DesignPatterns.CreationalPatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        for(var slide : slides)
            builder.addSlide(slide);
    }

}
