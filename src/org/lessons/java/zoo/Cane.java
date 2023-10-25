package org.lessons.java.zoo;

public class Cane extends Animale implements canSwim{
    public Cane(String nome) {
        super(nome);
    }

    public void verso(){
        System.out.println("Bau");
    }

    @Override
    void mangia() {
        System.out.println(super.getNome() + " mangia la carne.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
