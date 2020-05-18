public class Jaeger {

	int dist;
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height,
						float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		System.out.print(modelName + " ");
		return modelName;
	}

	public void technicalInfo() {
		System.out.println("modelName - " + modelName + "\n" + "mark - " + mark + "\n" + "origin - " + origin +"\n"
			+ "height = " + height + "\n" + "weight = " + weight + "\n" + "speed = " + speed + "\n" + "strength = "
			+ strength + "\n" + "armor = " + armor + "\n");
	}

	boolean drift() {
		System.out.println("вы вошли в дрифт");
		return true;
	}

	public void move() {
		System.out.println("вы прошли " + dist + " метров");
	}

	String scanKaiju() {
		System.out.println("Kaiju не обнаружил");
		return "nothing";
	}

	void useVortexCannon() {

	}
}