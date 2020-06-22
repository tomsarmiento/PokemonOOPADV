package tomassarmiento.pokemon;

public class Pokemon {
	private String name, type;
	private int health;
	static int count;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
		System.out.println("A new "+this.type+" pokemon has been created: " + this.name);
		System.out.println("Health:" + this.health);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pokemon.count = count;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health-=10;
		String name = pokemon.name;
		System.out.println("The "+name+" pokemon has been attacked. His health now is "+pokemon.health);
	}
	
	
	
}
