package com.DesignPatterns.BehaviouralPatterns.adapter.ThirdPartyLibrary;

import com.DesignPatterns.BehaviouralPatterns.adapter.Image;

public class Caramel {
    public void init () {

    }

    public void render(Image image){
        System.out.println("Applying caramel filter");
    }
}
