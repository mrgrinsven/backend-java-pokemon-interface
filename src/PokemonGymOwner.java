import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String town;


    public PokemonGymOwner(String name, String town, List<Pokemon> pokemonList) {
        super(name, pokemonList);
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}

