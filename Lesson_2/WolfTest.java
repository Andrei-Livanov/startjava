public class WolfTest {
	public static void main(String[] args) {
		Wolf w1 = new Wolf();

		w1.name = "Серый";
		System.out.println("Кличка волка: " + w1.name);
		w1.gender = 'м';
		System.out.println("Пол - " + w1.gender);
		w1.weight = 49;
		System.out.println("Вес = " + w1.weight +"кг");
		w1.age = 4;
		System.out.println("Возраст " + w1.age + " года");
		w1.color = "чёрный";
		System.out.println("Окрас " + w1.color);

		w1.walk();
		w1.sit();
		w1.run();
		w1.howl();
		w1.hunt();
	}
}