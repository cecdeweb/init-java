package fr.m2i;

public class Raisin extends Fruit{

    @Override
    public String name() {
        return "raisin";
    }

    @Override
    public String taste() {
        return "très sucré et plein de jus";
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
