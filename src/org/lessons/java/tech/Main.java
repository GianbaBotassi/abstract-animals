package org.lessons.java.tech;

public class Main {
    public static void main(String[] args) {

        PlayStop play2 = Creator.create("Playstation");
        play2.play();
        play2.stop();

        PlayStop dvd = Creator.create("LettoreDVD");
        dvd.play();
        dvd.stop();
    }
}
