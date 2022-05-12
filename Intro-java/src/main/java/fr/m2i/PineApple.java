package fr.m2i;

public class PineApple extends Fruit{
    @Override
    public void taste() {
        System.out.println("L'ananas a un goût un peu acidulé");
    }

    @Override
    public int getSize() {
        return 20;
    }

    @Override
    public boolean hasSeen() {
        return false;
    }
}
