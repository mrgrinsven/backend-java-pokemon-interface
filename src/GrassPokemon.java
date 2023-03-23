import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("Leafstorm", "Solarbeam", "Leechseed", "Leaveblade");
    private int damage;

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm");

        switch (enemy.getType()) {
            case "electric" -> {
                damage = 20;
            }

            case "fire" -> {
                damage = 15;
            }

            case "water" -> {
                damage = 10;
            }

            case "grass" -> {
                damage = 5;
            }

        }
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarbeam");

        switch (enemy.getType()) {
            case "electric" -> {
                damage = 25;
            }

            case "fire" -> {
                damage = 20;
            }

            case "water" -> {
                damage = 15;
            }

            case "grass" -> {
                damage = 10;
            }

        }
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechseed");

        switch (enemy.getType()) {
            case "electric" -> {
                damage = 30;
            }

            case "fire" -> {
                damage = 25;
            }

            case "water" -> {
                damage = 20;
            }

            case "grass" -> {
                damage = 15;
            }
        }

        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveblade");

        switch (enemy.getType()) {
            case "electric" -> {
                damage = 35;
            }

            case "fire" -> {
                damage = 30;
            }

            case "water" -> {
                damage = 25;
            }

            case "grass" -> {
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
