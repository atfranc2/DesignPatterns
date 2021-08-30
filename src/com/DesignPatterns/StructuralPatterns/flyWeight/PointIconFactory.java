package com.DesignPatterns.StructuralPatterns.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type)){
            var pointIcon = new PointIcon(type, new byte[10]);
            icons.put(type, pointIcon);
        }

        return icons.get(type);
    }
}
