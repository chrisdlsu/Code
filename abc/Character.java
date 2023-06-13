package abc;

public class Character {
    private double health;

    public Character(double health) {
        this.health = health;
    }

    public void heal(HealingItem item) {
        this.health = this.health + item.getHealAmount();
    }

    public void displayHealth() {
        System.out.println(health);
    }
}
