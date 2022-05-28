package fr.m2i;

public class Soldier extends AbstactBrawlerCharacter{

    private int attackDamage;

    public Soldier(String name, int healthPoint, int moveSpeed, int attackDamage) {
        super(name, healthPoint, moveSpeed);
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack(AbstactBrawlerCharacter enemy) {

        // check en premier si l'objet ennemi est null puis si il a de la santé via getter
        if (enemy == null || enemy.getHealthPoint() <=0){
            System.out.println("On ne frappe pas un ennemi à terre !");
            return; // il est déjo mart on s'arrête ici
        }

        // récupère les poitns de vie de mon ennemi via le getter
        int enemyHealthPoint = enemy.getHealthPoint();

        // Je décrément la vie de mon adversaire avec ses points d'attaque
        enemyHealthPoint -= attackDamage;

        // Je met à jour les points de vie de mon adversaire
        enemy.setHealthPoint(enemyHealthPoint);

        String attackMessageFormat = "%s a infligé %d de dégats à %s ! Il lui reste %d de point de vie";
        System.out.println(String.format(attackMessageFormat, name, attackDamage, enemy.getName(), enemy.getHealthPoint()));

    }
}
