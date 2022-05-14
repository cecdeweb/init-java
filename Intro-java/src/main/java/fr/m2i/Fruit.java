package fr.m2i;

public abstract class Fruit {

    private String seed="";
    private String name;

    public Fruit(String name){
        this.name=name;
    }
    public abstract String taste();
    public abstract int getSize();
    public abstract boolean hasSeed();

    public String getName() {
        return name;
    }

    public void miam(){
        if (hasSeed() == true){
            seed="Ce fruit A des pépins.";
        } else {
            seed="Ce fruit N'A PAS de pépins.";
        }
        System.out.println("Ceci est un fruit :" + name + ", qui est : " + taste() + ", de taille : " + getSize() + " cm de haut. " + seed);
    }

}
