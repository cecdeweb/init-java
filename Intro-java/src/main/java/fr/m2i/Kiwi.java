package fr.m2i;

public class Kiwi extends Fruit implements PeleFruit{

    public Kiwi(){
        super("Kiwi");
    }
    @Override
    public String taste() {
        return "acidulé et rafraîchissant";
    }

    @Override
    public int getSize() {
        return 6;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean epluche() {
        return true;
    }

    @Override
    public String getTypePeau() {
        return "douce";
    }
}
