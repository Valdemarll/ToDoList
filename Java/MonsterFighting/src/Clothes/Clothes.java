package Clothes;

public class Clothes {
    private int armor;
    private String specificity;
    private int stability = 100;

    public Clothes(int armor, String specificity){
        this.armor = armor;
        this.specificity = specificity;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }

    public void setSpecificity(String special) {
        this.specificity = special;
    }
    public String getSpecificity() {
        return specificity;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }
    public int getStability() {
        return stability;
    }
}
