package fr.m2i;

public class Soldier extends BrawlerCharacter{

    final Integer attackDamage=4;
    final String sentence="Je suis un soldier !";

    public String getName() {
        return "Soldier";
    }

    public String speak(){
        return sentence;
    }

    @Override
    public Integer attack() {
        return attackDamage;
    }
}

