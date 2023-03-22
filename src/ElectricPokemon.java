import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("Thunderpunch", "Electroball", "Thunder", "Voltackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){

    }

    void electroBall(Pokemon name, Pokemon enemy) {

    }

    void thunder(Pokemon name, Pokemon enemy) {

    }

    void voltTackle(Pokemon name, Pokemon enemy) {

    }

    List<String> getAttacks() {
        return attacks;
    }

}
