package Fim;

public class Competicao {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta();
		t1.nome = "Lucas";
		t1.idade = 23;
		String aquecer = t1.aquecer();
		
		System.out.println(t1.nome+" Tem "+ t1.idade);
		

	}

}