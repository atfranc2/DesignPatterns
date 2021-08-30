package com.DesignPatterns.StructuralPatterns.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory pointIconFactory = new PointIconFactory();

    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();

        var point1 = new Point(1, 2, pointIconFactory.getPointIcon(PointType.CAFE));
        var point2 = new Point(1, 2, pointIconFactory.getPointIcon(PointType.CAFE));
        var point3 = new Point(1, 2, pointIconFactory.getPointIcon(PointType.CAFE));

        points.add(point1);
        points.add(point2);
        points.add(point3);

        return points;
    }
}
