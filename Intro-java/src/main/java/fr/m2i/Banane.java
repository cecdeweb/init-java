package fr.m2i;

public class Banane extends Fruit{

    @Override
    public String name() {
        return "banabe";
    }

    @Override
    public String taste() {
        return "doux et sucré";
    }

    @Override
    public int getSize() {
        return 25;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
