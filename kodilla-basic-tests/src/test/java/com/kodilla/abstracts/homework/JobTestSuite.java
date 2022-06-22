package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JobTestSuite {

    Job painter = new Painter(3500);
    Job roadDesigner = new RoadDesigner(5500);

    @Test
    public void shouldGetRoadDesignerResponsibilities() {
        String responsibilities = roadDesigner.getResponsibilities();
        Assertions.assertEquals("Roads design", responsibilities);
    }

    @Test
    public void shouldGetPainterResponsibilities() {
        String responsibilities = painter.getResponsibilities();
        Assertions.assertEquals("Painting", responsibilities);
    }
}