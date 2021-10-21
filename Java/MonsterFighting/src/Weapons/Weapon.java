package Weapons;

public class Weapon {
    private int damage;
    private int stability = 100;
    private String type;

    public Weapon(int damage, String type){
        this.damage = damage;
        this.type = type;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }
    public int getStability() {
        return stability;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return "\n" + type + "\n" + damage + " урона\n" + stability + " прочности";
    }
}
