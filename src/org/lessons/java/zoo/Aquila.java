package org.lessons.java.zoo;

public class Aquila extends Animale implements canFly{
    public Aquila(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Cra cra");
    }

    @Override
    void mangia() {
        System.out.println(super.getNome() + " mangia i topolini.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
