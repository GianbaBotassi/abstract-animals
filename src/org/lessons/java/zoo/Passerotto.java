package org.lessons.java.zoo;

public class Passerotto extends Animale  implements canFly{
    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Cip");
    }

    @Override
    void mangia() {
        System.out.println(super.getNome() + " mangia i vermi.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
