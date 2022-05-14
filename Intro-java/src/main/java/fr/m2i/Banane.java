package fr.m2i;

public class Banane extends Fruit{

    public Banane() {
        super("banane");
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
