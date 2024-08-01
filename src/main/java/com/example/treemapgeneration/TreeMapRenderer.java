package com.example.treemapgeneration;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Map;

public class TreeMapRenderer {
    private static final int PADDING = 10;

    public Pane renderTreeMap() {
        Pane pane = new Pane();
        TreeMap treeMap = new TreeMap();
        treeMap.addNode("A", 30);
        treeMap.addNode("B", 50);
        treeMap.addNode("C", 20);

        int x = PADDING;
        int y = PADDING;
        for (Map.Entry<String, Integer> entry : treeMap.getData().entrySet()) {
            int value = entry.getValue();
            Rectangle rect = new Rectangle(x, y, value * 10, value * 10);
            rect.setFill(Color.hsb(Math.random() * 360, 1.0, 1.0));
            pane.getChildren().add(rect);

            x += (value * 10) + PADDING;
            if (x > pane.getWidth() - (value * 10)) {
                x = PADDING;
                y += (value * 10) + PADDING;
            }
        }

        return pane;
    }
}
