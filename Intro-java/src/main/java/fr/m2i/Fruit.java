package fr.m2i;

public abstract class Fruit {

    String seed="";

    private String name;
    public abstract String name();
    public abstract String taste();
    public abstract int getSize();
    public abstract boolean hasSeed();

    public void miam(){
        if (hasSeed() == true){
            seed="Ce fruit A des pépins.";
        } else {
            seed="Ce fruit N'A PAS de pépins.";
        }
        System.out.println("Ceci est un fruit :" + name() + ", qui est : " + taste() + ", de taille : " + getSize() + " cm de haut. " + seed);
    }

}
