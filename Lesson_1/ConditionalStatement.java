// TODO: научиться использовать оператор ветвления
// в Java - if.
public class ConditionalStatement {
	public static void main(String[] args) {
		byte age = 30;
		if(age > 20) {
			System.out.println("Старше 20 лет.");
		}

		char genderPerson = 'm';
		if(genderPerson == 'm') {
			System.out.println("Пол мужской.");
		}

		if(genderPerson != 'm') {
			System.out.println("Пол женский.");
		}

		float hight = 1.78f;
		if(hight < 1.80) {
			System.out.println("Рост меньше 180 см.");
		} else {
			System.out.println("Рост больше или равен 180 см.");
		}

		char firstNameLetter = 'A';
		if(firstNameLetter == 'M') {
			System.out.println("Имя Михаил.");
		} else if(firstNameLetter == 'I') {
			System.out.println("Имя Игорь.");
		} else {
			System.out.println("Имя Андрей.");
		}
	}
}