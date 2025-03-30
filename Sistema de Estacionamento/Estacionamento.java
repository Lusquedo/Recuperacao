class Veiculo {
    protected String modelo;
    protected String placa;
    protected int ano;

    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }

    public void exibirInformacoesCarro() {
        exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}

class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }

    public void exibirInformacoesMoto() {
        exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

public class Estacionamento {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen Gol", "ABC-1234", 1980, 4);
        Moto moto = new Moto("Honda CG 125", "DFG-5678", 1976, 125);

        System.out.println("=== Informações do Carro ===");
        carro.exibirInformacoesCarro();

        System.out.println("\n=== Informações da Moto ===");
        moto.exibirInformacoesMoto();
    }
}