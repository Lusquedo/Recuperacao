class Veiculo {
    String modelo, placa;
    int ano;

    Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    int numeroPortas;

    Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }

    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}

class Moto extends Veiculo {
    int cilindrada;

    Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }

    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

public class Estacionamento {
    public static void main(String[] args) {
        Carro c = new Carro("Volkswagen Gol", "ABC-1234", 1980, 4);
        Moto m = new Moto("Honda CG 125", "DFG-5678", 1976, 125);

        System.out.println("=== Informações do Carro ===");
        c.exibirInformacoes();

        System.out.println("\n=== Informações da Moto ===");
        m.exibirInformacoes();
    }
}
