package tomassarmiento.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pokemons = new Pokedex();
		Pokemon Pikachu = pokemons.createPokemon("Pikachu", "Electric", 150);
		Pokemon Bulbasaur = pokemons.createPokemon("Bulbasaur", "Grass/Poison", 100);
		
		Bulbasaur.attackPokemon(Pikachu);
		pokemons.listPokemon();

	}

}
