package abc;

public class Main {
    public static void main(String[] args) {
        Character knight = new Character(50);
        HealingItem potion = new HealingItem(30);

        knight.displayHealth();
        knight.heal(potion);
        knight.displayHealth();
    }
}
