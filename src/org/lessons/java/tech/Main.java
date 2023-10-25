package org.lessons.java.tech;

public class Main {
    public static void main(String[] args) {
        Creator cighi = new Creator();
        PlayStop play2 = cighi.create("Playstation");
        play2.play();
        play2.stop();

        PlayStop dvd = cighi.create("LettoreDVD");
        dvd.play();
        dvd.stop();
    }
}
