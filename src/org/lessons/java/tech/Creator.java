package org.lessons.java.tech;

public class Creator {


    public PlayStop create(String tipo) {
        if (tipo.equals("Playstation")) {
            return new Playstation();
        }
        return new LettoreDVD();
    }

}
