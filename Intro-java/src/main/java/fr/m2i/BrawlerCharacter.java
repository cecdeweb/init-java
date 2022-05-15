package fr.m2i;

public abstract class BrawlerCharacter {

    private String name;
    private Integer healthPoint=10; // points de vie
    private Integer moveSpeed=1; // vitesse de déplacement ?
    public String sentence;

    /*
       public abstract String brawlerCharacter(String, Integer, Integer);
       Je suppose que c'est pour afficher : Il reste x points de vie au soldier et il attaque de x points son adversaire
    */
    public abstract Integer attack(); // methode à définir dans class enfant

    public String speak(){
        return sentence;
    };
/*
   public Integer move(){
       return 1;
   }
*/


    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint, Integer attackDamage) {
        this.healthPoint = healthPoint-attackDamage;
    }
}




