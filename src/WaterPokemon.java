import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("Surf", "Hydropump", "Hydrocanon", "Raindance");
    private int damage;

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");

        switch (enemy.getType()) {
            case "fire" -> {
                damage = 20;
            }

            case "electric" -> {
                damage = 15;
            }

            case "grass" -> {
                damage = 10;
            }

            case "water" -> {
                damage = 5;
            }

        }
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump");

        switch (enemy.getType()) {
            case "fire" -> {
                damage = 25;
            }

            case "electric" -> {
                damage = 20;
            }

            case "grass" -> {
                damage = 15;
            }

            case "water" -> {
                damage = 10;
            }

        }
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon");

        switch (enemy.getType()) {
            case "fire" -> {
                damage = 30;
            }

            case "electric" -> {
                damage = 25;
            }

            case "grass" -> {
                damage = 20;
            }

            case "water" -> {
                damage = 15;
            }
        }

        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with raindance");

        switch (enemy.getType()) {
            case "fire" -> {
                damage = 35;
            }

            case "electric" -> {
                damage = 30;
            }

            case "grass" -> {
                damage = 25;
            }

            case "water" -> {
                damage = 20;
            }
        }

        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    List<String> getAttacks() {
        return attacks;
    }
}
