public class JaegerTest {
	public static void main(String[] args) {
		Jaeger j1 = new Jaeger();
		Jaeger j2 = new Jaeger();

		j1.setModelName("Crimson Typhoon");
		j2.setModelName("Striker Eureka");
		System.out.println("Name j1: " + j1.getModelName());
		System.out.println("Name j2: " + j2.getModelName());

		j1.setHeight(76.2f);
		j2.setHeight(76.5f);
		System.out.println("Height j1 = " + j1.getHeight());
		System.out.println("Height j2 = " + j2.getHeight());

		j1.setSpeed(9);
		j2.setSpeed(10);
		System.out.println("Speed j1 = " + j1.getSpeed());
		System.out.println("Speed j2 = " + j2.getSpeed());

		System.out.print("j1 ");
		j1.drift();
		System.out.print("j2 "); 
		j2.drift();

		j1.dist = 100;
		j1.move();
		j2.dist = 200;
		j2.move();

		System.out.print("j1 ");
		j1.scanKaiju();
	}
}