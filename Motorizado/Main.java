package Motorizado;

public class Main {

    public static void main(String[] args) {
        Carro veiculo1 = new Carro("Polo", "Petro", 15.000);
        veiculo1.motor = "1600";
        veiculo1.portas = 2;
        veiculo1.combustivel = "Gasolina";
        veiculo1.locomover();
        System.out.println("Nome: " + veiculo1.nome);
        System.out.println("Cor: " + veiculo1.cor);
        System.out.println("Preco: " + veiculo1.preco);
        System.out.println("Portas: " + veiculo1.portas);
        System.out.println("Motor: " + veiculo1.motor);
        System.out.println("Combustivel: " + veiculo1.motor);

        Bicicleta bicicleta1 = new Bicicleta("Calloi", "Preta", 19.000);
        bicicleta1.tracao = "Jumento";
        System.out.println("Nome: " + bicicleta1.nome);
        System.out.println("Cor: " + bicicleta1.cor);
        System.out.println("Preco: " + bicicleta1.preco);
        System.out.println("Tração: " + bicicleta1.tracao);

    }
}