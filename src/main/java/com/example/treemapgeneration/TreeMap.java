package com.example.treemapgeneration;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    private final Map<String, Integer> data;

    public TreeMap() {
        this.data = new HashMap<>();
    }

    public void addNode(String name, int value) {
        data.put(name, value);
    }

    public Map<String, Integer> getData() {
        return data;
    }
}
