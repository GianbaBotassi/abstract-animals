package org.lessons.java.tech;

public class Creator {


    public static PlayStop create(String tipo) {
        if (tipo.equals("Playstation")) {
            return new Playstation();
        }
        if(tipo.equals("LettoreDVD")){
        return new LettoreDVD();
        }
        return null;
    }

}
