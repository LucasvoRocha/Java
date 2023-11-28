package loops;

public class Exe7 {

	public static void main(String[] args) {
		int cont = 0;
		for (int x = 1; x< 100; x++) {
			if(x % 3 == 0) {
				cont++;
				System.out.println(x);}
			}
		System.out.println("+=============+\n"
				+ "|*****"+ cont +"******|\n"
						+ "+=============+");
		}

	}