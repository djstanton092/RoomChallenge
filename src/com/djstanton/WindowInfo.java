package com.djstanton;

public class WindowInfo {
    private int count;
    private Dimensions dimensions;
    private boolean canOpen;

    public WindowInfo(int count, Dimensions dimensions, boolean canOpen) {
        this.count = count;
        this.dimensions = dimensions;
        this.canOpen = canOpen;
    }

    public int getCount() {
        return count;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isCanOpen() {
        return canOpen;
    }
}
