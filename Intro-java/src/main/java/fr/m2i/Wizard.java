package fr.m2i;

public class Wizard extends BrawlerCharacter {

    private Integer mana;
    final String sentence="Je suis un Wizard !";

    public String getName() {
        return "Wizard";
    }
    public String speak(){
        return sentence;
    }

    @Override
    public Integer attack() {
        return 3;
    }
}

