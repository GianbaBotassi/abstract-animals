package org.lessons.java.zoo;

public class Delfino extends Animale  implements canSwim{
    public Delfino(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Boooooo");
    }

    @Override
    public void mangia() {
        System.out.println(super.getNome() + " mangia i pesciolini.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
