package fr.m2i;

public class Wizard extends BrawlerCharacter {

    private Integer mana=3;
    public Integer healtEnnemy=getHealthPoint();
    final String sentence="Je suis un Wizard !";

    public String getName() {
        return "Wizard";
    }
    public String speak(){
        return sentence;
    }

    @Override
    public void ennemy(Integer healthPoint) {
        //System.out.println("healthPoint = " + healthPoint + " healthEnnemy = " + healtEnnemy);
        //trouver solution pour retourner result dans variable
        if (healtEnnemy>healthPoint){
            System.out.println("Votre ennemi n'a plus que : ");
            System.out.println(healtEnnemy-healthPoint + "pts");
        } else if (healthPoint<0){
            System.out.println("Merci de rentrer un nombre supérieur à 0");
        } else  {
            System.out.println("Votre ennemi est mort !");

        }
    }

    @Override
    public Integer attack() {
        return healtEnnemy-=mana;
    }
}

