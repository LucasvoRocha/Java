package loops;
import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			int n1 = entrada.nextInt();
			
			if(n1%2==0){
				n1 = n1/2;
				System.out.println(n1);}
			else {
				System.out.println (n1 = 3 * n1 +1);
			}
	}
}
