package com.DesignPatterns.BehaviouralPatterns.adapter;

import com.DesignPatterns.BehaviouralPatterns.adapter.ThirdPartyLibrary.Caramel;

public class AdapterUsage {
    public static void Usage(){
        var image = new Image();
        var view = new ImageView(image);
        var caramelFilter = new CaramelFilter(new Caramel()); // Third party, has adapter applied
        var vividFilter = new VividFilter();

        view.render(caramelFilter);
        view.render(vividFilter);
    }

}
