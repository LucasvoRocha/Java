package loops;

public class Exe5 {

	public static void main(String[] args) {
		for ( int x = 1; x <= 100; x++) {
		
			if(x == 50) {
			System.out.println("+=================+\n"
					+ "|Numero encontrado|\n"
					+ "+=================+");
			break;
			}
			System.out.println(x);
		}

	}
}