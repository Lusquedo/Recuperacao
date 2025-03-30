class Funcionario {
    String nome;
    int idade;
    double salario;

    Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
    }
}

class Gerente extends Funcionario {
    String departamento;

    Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}

class Desenvolvedor extends Funcionario {
    String linguagemProgramacao;

    Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao) {
        super(nome, idade, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Linguagem de Programação: " + linguagemProgramacao);
    }
}

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Gerente g = new Gerente("João da Silva", 60, 9000.00, "T.I");
        Desenvolvedor d = new Desenvolvedor("Maria dos Santos", 30, 6000.00, "Java");

        System.out.println("Informações do Gerente:");
        g.exibirInformacoes();
        System.out.println();
        
        System.out.println("Informações do Desenvolvedor:");
        d.exibirInformacoes();
    }
}
