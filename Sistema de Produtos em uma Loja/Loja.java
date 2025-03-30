class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

class ProdutoComDesconto extends Produto {
    private double desconto;

    public ProdutoComDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public void exibirDetalhesComDesconto() {
        double precoComDesconto = preco - (preco * (desconto / 100));
        System.out.println("Produto: " + nome);
        System.out.println("Preço original: R$ " + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
    }
}

public class Loja {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 4600.00);
        ProdutoComDesconto produto2 = new ProdutoComDesconto("Notebook", 4600.00, 10);

        System.out.println("=== Produto sem desconto ===");
        produto1.exibirDetalhes();

        System.out.println("\n=== Produto com desconto ===");
        produto2.exibirDetalhesComDesconto();
    }
}