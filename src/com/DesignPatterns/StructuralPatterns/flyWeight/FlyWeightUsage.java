package com.DesignPatterns.StructuralPatterns.flyWeight;

public class FlyWeightUsage {
    public static void Usage() {
        var pointService = new PointService(new PointIconFactory());
        for(var point : pointService.getPoints())
            point.draw();

    }

}
