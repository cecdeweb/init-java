package fr.m2i;

public abstract class BrawlerCharacter {

    private String name;
    private Integer healthPoint=10;
    // points de vie incrémentation gérée dans wizard
    private Integer moveSpeed=1;
    // vitesse de déplacement je m'en occupe pas pour le moment
    public String sentence;

    public abstract void ennemy(Integer healthPoint);
    //   je récupère pour l'instant que les points de vie
    //   les paramètres de l'adversaire


    public abstract Integer attack(); // methode à définir dans class enfant

    public String speak(){
        return sentence;
    };
   public Integer move(){
       return 1;
   }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }
}




