package Fim;

public class Triatleta implements Nadador, Ciclista, Corredor {
	public Triatleta() {
		
	}

	@Override
	public String aquecer() {
		return "Foi aquecer";
	}

	@Override
	public String correr() {
		return "Foi correr";
	}

	@Override
	public String pedalar() {
		return "Foi pedalar";
	}

	@Override
	public String nadar() {
		return "Foi nadar";
	}

}
