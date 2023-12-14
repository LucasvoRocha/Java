package Encapsulamento;

public class RH {

	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios();
		f1.nome = "maria";
		
		f1.setCpf("12345678900");
		String cpf = f1.getCpf();
		System.out.println(cpf);
		
	}

}