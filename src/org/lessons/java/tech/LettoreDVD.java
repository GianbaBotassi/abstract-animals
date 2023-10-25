package org.lessons.java.tech;

public class LettoreDVD extends Creator implements PlayStop {

    @Override
    public void play() {
        System.out.println("Sono un lettoreDVD e sono in modalità play.");
    }

    @Override
    public void stop() {
        System.out.println("Sono un lettoreDVD e sono in modalità stop.");
    }
}
