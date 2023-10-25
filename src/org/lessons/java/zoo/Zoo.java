package org.lessons.java.zoo;

public class Zoo {
    public static void main(String[] args) {
        canFly cighi = new Aquila("Cighi");
        canSwim maki = new Cane("Maki");

        faiVolare(cighi);
        faiNuotare(maki);
    }
    private static void faiVolare(canFly anim){
        anim.vola();
    }
    private static void faiNuotare(canSwim anim){
        anim.nuota();
    }
}
