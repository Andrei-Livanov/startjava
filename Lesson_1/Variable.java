public class Variable {

	public static void main(String[] args) {

	    // TODO: объявить переменные всех примитивных типов данных
	    // в Java. Присвоить значение и вывести на консоль. 

		byte core = 6;
		System.out.println("Количество ядер: " + core);

		short typeOS = 64;
		System.out.println("Тип системы: " + typeOS);

		int ld = 256;
		System.out.println("Локальный диск: " + ld + " ГБ");

		long verOS = 1809;
		System.out.println("Версия ОС: " + verOS);

		float ram = 16.0f;
		System.out.println("Оперативная память: " + ram + " ГБ");

		double cpuFr = 2.21;
		System.out.println("Частота процессора: " + cpuFr + " GHz");

		char cpu = 'i', n = '7';
		System.out.println("Процессор: " + cpu + n);

		boolean win = true;
		if(win != false) {
			System.out.println("ОС Windows 10");
		}		
	}
}