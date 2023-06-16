package abc;

public class Main {
    public static void main(String[] args) {

        //create objects from the two classes
        Character knight = new Character(50);
        HealingItem potion = new HealingItem(30);

        //show how the two relate
        knight.displayHealth();
        knight.heal(potion);
        knight.displayHealth();
    }
}
