class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

class ProdutoComDesconto extends Produto {
    double desconto;

    ProdutoComDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    void exibirDetalhes() {
        double precoFinal = preco - (preco * desconto / 100);
        System.out.println("Produto: " + nome);
        System.out.println("Preço original: R$ " + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço com desconto: R$ " + precoFinal);
    }
}

public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4600.00);
        ProdutoComDesconto p2 = new ProdutoComDesconto("Notebook", 4600.00, 10);

        System.out.println("=== Produto sem desconto ===");
        p1.exibirDetalhes();
        
        System.out.println("\n=== Produto com desconto ===");
        p2.exibirDetalhes();
    }
}
