package fr.m2i;

public class Stranberry extends Fruit{

    public Stranberry(){
        super("Stranberry");
    }
    @Override
    public String taste() {
        return "doux et sucré";
    }

    @Override
    public int getSize() {
        return 3;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
