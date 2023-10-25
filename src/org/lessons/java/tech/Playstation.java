package org.lessons.java.tech;

public class Playstation extends Creator implements PlayStop {

    @Override
    public void play() {
        System.out.println("Sono una playstation e sono in modalità play.");
    }

    @Override
    public void stop() {
        System.out.println("Sono una playstation e sono in modalità stop.");
    }
}
