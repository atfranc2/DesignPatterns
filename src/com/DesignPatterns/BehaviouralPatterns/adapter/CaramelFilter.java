package com.DesignPatterns.BehaviouralPatterns.adapter;

import com.DesignPatterns.BehaviouralPatterns.adapter.ThirdPartyLibrary.Caramel;

public class CaramelFilter implements Filter {

    private Caramel caramelFilter;

    public CaramelFilter(Caramel caramel) {
        caramelFilter = caramel;
    }

    @Override
    public void apply(Image image) {
        caramelFilter.init();
        caramelFilter.render(image);
    }
}
