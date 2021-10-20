package Creatures;

import Clothes.Clothes;
import Weapons.Weapon;
import Clothes.ClothesDescription;
import Weapons.WeaponDescription;

import java.util.Objects;
import java.util.Scanner;


public class Player{
    Scanner scanner = new Scanner(System.in);
    private int healthMax = 100;
    private int health = healthMax;
    private int armor;
    private int healer = 5;

    private Clothes boots;
    private Clothes helmet;
    private Clothes bodyarmor;
    private Clothes legarmor;
    private Clothes shield;

    private Weapon weapon;

    public Player(){
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

    public Weapon getNowWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean fighting(int fightNum){
        Monster monster = new Monster((int)((Math.random() + 1)*50 + fightNum*20));
        Scanner scanner = new Scanner(System.in);

        int phase = (int)(Math.random()*10);
        while (this.health > 0 && monster.getHealth() > 0) {
            System.out.println(this);
            System.out.println(monster);

            if (phase % 2 == 0){
                System.out.println("\nПеред вами монстр.\nКакое действие совершить(атака/подлечиться)");
                String skill = scanner.nextLine();

                if (Objects.equals(skill, "атака")){
                    monster.setHealth(attack(monster));
                }
                if (Objects.equals(skill, "подлечиться")){
                    heal();
                }
            } else{
                this.health = monster.fighting(this);
            }
            phase += 1;
        }

        if (this.health <= 0){
            return false;
        } else{
            stealFromEnemy(monster);
            return true;
        }
    }

    public int restoreHealth(){
        System.out.println("Восстановить здоровье полностью?(Да/Нет)");
        String restoreHealth = scanner.nextLine();
        if (Objects.equals(restoreHealth, "Да")){
            healer -= (healthMax - health)/weapon.getDamage();
            return healthMax;
        }
        return health;
    }



    private void stealFromEnemy(Monster monster){
        Scanner scanner = new Scanner(System.in);
        this.healer += monster.getHealer();
        monster.setHealth(0);

        System.out.println(monster);
        System.out.println("Введите, какой один предмет хотите украсть у противника");
        String steal = scanner.nextLine();

        if (Objects.equals(steal, "Ботинки")){
            this.boots = monster.getBoots();
            System.out.println(ClothesDescription.BOOTS.description());
        }
        if (Objects.equals(steal, "Поножи")){
            this.legarmor = monster.getLegarmor();
            System.out.println(ClothesDescription.LEGARMOR.description());
        }
        if (Objects.equals(steal, "Доспех")){
            this.bodyarmor = monster.getBodyarmor();
            System.out.println(ClothesDescription.BODYARMOR.description());
        }
        if (Objects.equals(steal, "Шлем")){
            this.helmet = monster.getHelmet();
            System.out.println(ClothesDescription.HELMET.description());
        }
        if (Objects.equals(steal, "Щит")){
            this.shield = monster.getShield();
            System.out.println(ClothesDescription.SHIELD.description());
        }
        if (Objects.equals(steal, "Оружие")){
            this.weapon = monster.getWeapon();

            if (Objects.equals(this.weapon.getType(), "Меч")){
                System.out.println(WeaponDescription.Sword.description(this.weapon.getDamage(), this.weapon.getStability()));
            }
            if (Objects.equals(this.weapon.getType(), "Арбалет")){
                System.out.println(WeaponDescription.Crossbow.description(this.weapon.getDamage(), this.weapon.getStability()));
            }
            if (Objects.equals(this.weapon.getType(), "Огнемет")){
                System.out.println(WeaponDescription.Flamethrower.description(this.weapon.getDamage(), this.weapon.getStability()));
            }
            if (Objects.equals(this.weapon.getType(), "Пистолет")){
                System.out.println(WeaponDescription.Gun.description(this.weapon.getDamage(), this.weapon.getStability()));
            }
            if (Objects.equals(this.weapon.getType(), "Бомба")){
                System.out.println(WeaponDescription.Bombs.description(this.weapon.getDamage(), this.weapon.getStability()));
            }
        }
    }


    private void heal(){
        if (this.healer > 0){
            this.health += weapon.getDamage();
            if (this.health > healthMax){
                this.health = healthMax;
            }
            this.healer -= 1;
        }
    }

    private int attack(Monster monster){
        int damage = monster.protect(weapon.getDamage());
        weapon.setStability(weapon.getStability() - 1);
        return monster.getHealth() - damage;
    }

    public int protect(int attack){
        Scanner scanner = new Scanner(System.in);

        if (this.shield != null) {
            int phase = (int)(Math.random()*10);
            System.out.println("\nВведите 0 или 1, чтобы использовать щит.\nВ случае правильного ответа, щит сработает.");

            int value = scanner.nextInt();
            if (phase % 2 == value){
                int damage = attack * (shield.getArmor() / this.health);
                shield.setStability(shield.getStability() - damage);
                return attack - damage;
            }
        }

        return attack;
    }



    public String toString(){
        return "\nИгрок.\n" +
                "Здоровье: " + health + ", защита: " + armor +
                "\nАптечка: " + healer +
                "\nБотинки: " + boots +
                "\nПоножи: " + legarmor +
                "\nДоспех: " + bodyarmor +
                "\nШлем: " + helmet +
                "\nЩит: " + shield +
                "\nОружие: " + weapon;
    }

}
