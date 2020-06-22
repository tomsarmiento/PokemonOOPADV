package tomassarmiento.pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface{
	Pokemon pokemon; 
	String name;
	int health;
	String type;
	ArrayList<String> list = new ArrayList<String>();
	
	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon pokemon = new Pokemon(name, type, health);
		list.add(pokemonInfo(pokemon));
		return pokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		String info = "Name: "+pokemon.getName()+". Type: "+pokemon.getType()+". Health: "+pokemon.getHealth();
		return info;
	}
}
