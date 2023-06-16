package abc;

public class Character {
    // attribute
    private double health;

    // contructor
    public Character(double health) {
        this.health = health;
    }

    // setter
    public void heal(HealingItem item) {
        this.health = this.health + item.getHealAmount();
    }

    public void displayHealth() {
        System.out.println(health);
    }
}
