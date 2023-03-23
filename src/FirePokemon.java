import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("Inferno", "Pyroball", "Firelash)", "Flamethrower");
    private int damage;

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");

        switch (enemy.getType()) {
            case "grass" -> {
                damage = 20;
            }

            case "water" -> {
                damage = 15;
            }

            case "electric" -> {
                damage = 10;
            }

            case "fire" -> {
                damage = 5;
            }

        }

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball");

        switch (enemy.getType()) {
            case "grass" -> {
                damage = 25;
            }

            case "water" -> {
                damage = 20;
            }

            case "electric" -> {
                damage = 15;
            }

            case "fire" -> {
                damage = 10;
            }

        }

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with firelash");

        switch (enemy.getType()) {
            case "grass" -> {
                damage = 30;
            }

            case "water" -> {
                damage = 25;
            }

            case "electric" -> {
                damage = 20;
            }

            case "fire" -> {
                damage = 15;
            }
        }

        enemy.setHp(enemy.getHp() - damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower");

        switch (enemy.getType()) {
            case "grass" -> {
                damage = 35;
            }

            case "water" -> {
                damage = 30;
            }

            case "electric" -> {
                damage = 25;
            }

            case "fire" -> {
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
