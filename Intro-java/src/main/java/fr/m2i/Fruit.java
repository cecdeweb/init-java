package fr.m2i;

public abstract class Fruit {

    public abstract void taste();
    public abstract int getSize();
    public abstract boolean hasSeen();


    public void miam(){
        System.out.println("Manger 5 fruits");
    }
}
