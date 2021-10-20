package Creatures;

import Clothes.Clothes;
import Weapons.Sword;
import Weapons.Weapon;

public class Monster {
    private int healthMax;
    private int health;
    private int armor;
    private int healer = 10;

    private Clothes boots;
    private Clothes helmet;
    private Clothes bodyarmor;
    private Clothes legarmor;
    private Clothes shield;

    private Weapon weapon;

    public Monster(int healthMax) {
        this.healthMax = healthMax;
        this.health = healthMax;
        this.weapon = new Sword((int)(Math.random()*20 + 10), "Меч");
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
    }

    public Clothes getBoots() {
        return boots;
    }

    public void setBoots(Clothes boots) {
        this.boots = boots;
    }

    public Clothes getLegarmor() {
        return legarmor;
    }

    public void setLegarmor(Clothes legarmor) {
        this.legarmor = legarmor;
    }

    public Clothes getBodyarmor() {
        return bodyarmor;
    }

    public void setBodyarmor(Clothes bodyarmor) {
        this.bodyarmor = bodyarmor;
    }

    public Clothes getHelmet() {
        return helmet;
    }

    public void setHelmet(Clothes helmet) {
        this.helmet = helmet;
    }

    public Clothes getShield() {
        return shield;
    }

    public void setShield(Clothes shield) {
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon nowWeapon) {
        this.weapon = nowWeapon;
    }

    public int getHealer() {
        return healer;
    }

    public void setHealer(int healer) {
        this.healer = healer;
    }

    public int fighting(Player player){
        int phase = (int)(Math.random()*10);
        if (phase % 2 == 0) {
            System.out.println("\nВас атакует монстр!\n");
            return attack(player, player.protect(weapon.getDamage()));
        } else{
            System.out.println("\nМонстр лечится...\n");
            heal();
            return player.getHealth();
        }
    }

    private void heal(){
        if (healer > 0){
            this.health += weapon.getDamage();
            if (this.health > healthMax){
                this.health = healthMax;
            }
            healer -= 1;
        }
    }

    private int attack(Player player, int damage){
        weapon.setStability(weapon.getStability() - 1);
        return player.getHealth() - damage;
    }

    public int protect(int attack){
        int phase = (int)(Math.random()*10);
        if (phase % 2 == 0) {
            if (this.shield != null) {
                int damage = attack * (shield.getArmor() / this.health);
                shield.setStability(shield.getStability() - damage);
                return attack - damage;
            }
        }
        return attack;
    }

    public String toString(){
        return "\nМонстр.\n" +
                "Здоровье: " + health + ", защита: " + armor +
                "\nБотинки: " + boots +
                "\nПоножи: " + legarmor +
                "\nДоспех: " + bodyarmor +
                "\nШлем: " + helmet +
                "\nЩит: " + shield +
                "\nОружие: " + weapon;
    }


}

