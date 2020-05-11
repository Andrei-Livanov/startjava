public class Person {

	char gender = 'm';
	String name = "Пётр";
	double height = 1.75;
	int weight = 78;
	int age = 41;

	boolean sit() {
		System.out.println(name + " сидит");
		return true;
	}

	void walk() {
		System.out.println(name + " гуляет");
	}

	void run() {
		System.out.println(name + " бежит");
	}

	String say() {

	}

	void learnJava() {

	}
}