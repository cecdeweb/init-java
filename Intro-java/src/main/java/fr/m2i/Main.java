package fr.m2i;

public class Main {
    public static void main(String[] args) {

        Pomme p = new Pomme();
        p.miam();

        Banane b = new Banane();
        b.miam();

        Raisin r = new Raisin();
        r.miam();

        Kiwi k = new Kiwi();
        k.miam();

        Stranberry st = new Stranberry();
        st.miam();


        if (p instanceof PeleFruit){
            // vérifie si pomme est une instance de la class PeleFruit ou une interface comme ici
            System.out.println("Ce fruit implémente une interface PeleFruit");
            PeleFruit fruit = p;

            fruit.epluche();

        }

    }

}