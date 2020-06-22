package tomassarmiento.pokemon;

public class Pokedex extends AbstractPokemon{
	int myPokemons;
	
	public void listPokemon() {
		myPokemons = Pokemon.getCount();
		System.out.println("You have "+myPokemons+" pokemons: ");
		for(String p: list) {
			System.out.println(p);
		}
	}

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pokemonList() {
		// TODO Auto-generated method stub
		
	}
}
