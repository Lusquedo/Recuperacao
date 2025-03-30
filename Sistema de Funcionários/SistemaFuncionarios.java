class Funcionario {
    protected String nome;
    protected int idade;
    protected double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
    }
}

class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    public void exibirInformacoesGerente() {
        exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}

class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao) {
        super(nome, idade, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public void exibirInformacoesDesenvolvedor() {
        exibirInformacoes();
        System.out.println("Linguagem de Programação: " + linguagemProgramacao);
    }
}

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João Silva", 60, 9000.00, "T.I");
        Desenvolvedor dev = new Desenvolvedor("Maria Santos", 30, 6000.00, "Java");

        System.out.println("Informações do Gerente:");
        gerente.exibirInformacoesGerente();
        System.out.println();
        
        System.out.println("Informações do Desenvolvedor:");
        dev.exibirInformacoesDesenvolvedor();
    }
}