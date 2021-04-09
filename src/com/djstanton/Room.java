package com.djstanton;


import java.awt.*;

public class Room {
    String name;
    Dimensions dimensions;
    WallFinish wallfinish;
    Flooring flooring;
    WindowInfo windowInfo;

    public Room(String name, Dimensions dimensions, WallFinish wallfinish, Flooring flooring, WindowInfo windowInfo) {
        this.name = name;
        this.dimensions = dimensions;
        this.wallfinish = wallfinish;
        this.flooring = flooring;
        this.windowInfo = windowInfo;
    }
}
