import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("Thunderpunch", "Electroball", "Thunder", "Voltackle");
    private int damage;

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch");

        switch (enemy.getType()) {
            case "water" -> {
                damage = 20;
            }

            case "grass" -> {
                damage = 15;
            }

            case "fire" -> {
                damage = 10;
            }

            case "electric" -> {
                damage = 5;
            }

        }
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroball");

        switch (enemy.getType()) {
            case "water" -> {
                damage = 25;
            }

            case "grass" -> {
                damage = 20;
            }

            case "fire" -> {
                damage = 15;
            }

            case "electric" -> {
                damage = 10;
            }

        }
        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");

        switch (enemy.getType()) {
            case "water" -> {
                damage = 30;
            }

            case "grass" -> {
                damage = 25;
            }

            case "fire" -> {
                damage = 20;
            }

            case "electric" -> {
                damage = 15;
            }
        }

        enemy.setHp(enemy.getHp() - damage);

        System.out.println(enemy.getName() + " loses " + damage + " hp");

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volttackle");

        switch (enemy.getType()) {
            case "water" -> {
                damage = 35;
            }

            case "grass" -> {
                damage = 30;
            }

            case "fire" -> {
                damage = 25;
            }

            case "electric" -> {
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
