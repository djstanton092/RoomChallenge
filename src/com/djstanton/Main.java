package com.djstanton;

public class Main {

    public static void main(String[] args) {
        Room livingRoom = new Room("Living Room",
                new Dimensions(20,20,12),
                new WallFinish("black", "flat", "pebble tex"),
                new Flooring("black", "shag carpet"),
                new WindowInfo(1, new Dimensions(2, 3,0), false)
                );


        System.out.println(livingRoom.name);
        System.out.println(livingRoom.dimensions.getHeight() + " " + livingRoom.wallfinish.getPaintColor());


    }
}
