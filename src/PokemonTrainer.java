import java.util.List;

public class PokemonTrainer {
    private final String name;

    private List<Pokemon> pokemonList;

    public PokemonTrainer(String name, List<Pokemon> pokemonList) {
        this.name = name;
        this.pokemonList = pokemonList;
    }

    public String getName() {
        return this.name;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemonList;
    }
}
