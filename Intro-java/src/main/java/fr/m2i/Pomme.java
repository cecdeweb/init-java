package fr.m2i;

public class Pomme extends Fruit {

    @Override
    public String name() {
        return "pomme";
    }

    @Override
    public String taste() {
         return "sucré";
    }

    @Override
    public int getSize() {
        return 8;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
