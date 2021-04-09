package com.djstanton;

public class WallFinish {
    private String paintColor;
    private String paintFinish;
    private String wallTexture;

    public WallFinish(String paintColor, String paintFinish, String wallTexture) {
        this.paintColor = paintColor;
        this.paintFinish = paintFinish;
        this.wallTexture = wallTexture;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public String getPaintFinish() {
        return paintFinish;
    }

    public String getWallTexture() {
        return wallTexture;
    }
}
