package fr.m2i;

public abstract class AbstactBrawlerCharacter {

    protected String name;
    protected int healthPoint;
    protected int moveSpeed;

    public AbstactBrawlerCharacter(String name, int healthPoint, int moveSpeed){
        this.name = name;
        this.healthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
    }

    public abstract void attack(AbstactBrawlerCharacter enemy);

    public void speak(String replique){
        System.out.println(String.format("%s dit : \"%\"", name, replique));
    }
    public void move() {
        System.out.println(String.format("%s a fait un bon %d cases !", name, moveSpeed));
    }
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }


}
