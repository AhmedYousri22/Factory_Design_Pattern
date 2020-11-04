package Enemys;

public  abstract class Enemy {
    String name;
   private int health;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
public  void show()
{
    System.out.printf("name is %s : damage is %d : health is %d %n",getName(),getDamage(),getHealth());
}
}
