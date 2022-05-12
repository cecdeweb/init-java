package fr.m2i;

public class Apple extends Fruit {

    @Override
    public void taste() {
        System.out.println("La pomme a un goût sucré");
        super.miam();
    }

    @Override
    public int getSize() {
        return 5;
    }

    @Override
    public boolean hasSeen() {
        return true;
    }
}
