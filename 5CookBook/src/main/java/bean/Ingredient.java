package bean;

public class Ingredient {
	// attributes
	private int id;
	private String name;
	private int kcalPerGram;

	// constructors
	public Ingredient() {
		super();
	}

	public Ingredient(String name, int kcalPerGram) {
		super();
		this.name = name;
		this.kcalPerGram = kcalPerGram;
	}

	public Ingredient(int id, String name, int kcalPerGram) {
		super();
		this.id = id;
		this.name = name;
		this.kcalPerGram = kcalPerGram;
	}

	// getters
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getKcalPerGram() {
		return kcalPerGram;
	}

	// toString
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", kcalPerGram=" + kcalPerGram + "]";
	}
}
