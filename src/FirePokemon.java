import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("Inferno", "Pyroball", "Firelash)", "Flamethrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 20);
            }

            case "water" -> {
                enemy.setHp(enemy.getHp() - 15);
            }

            case "electric" -> {
                enemy.setHp(enemy.getHp() - 10);
            }

            case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
            }

            enemy.setHp(enemy.getHp() - damage);

            System.out.println(name.getName() + " attacks with inferno dealing " + + " to" + enemy.getName() );

        }
    }

    void pyroBall(Pokemon name, Pokemon enemy) {

    }

    void fireLash(Pokemon name, Pokemon enemy) {

    }

    void flameThrower(Pokemon name, Pokemon enemy) {

    }


    List<String> getAttacks() {
        return attacks;
    }

}
