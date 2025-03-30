class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Forma: " + nome);
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

class Retangulo extends Forma {
    protected double largura;
    protected double altura;

    public Retangulo(double largura, double altura) {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}

class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
        this.nome = "Quadrado";
    }
}

public class Formas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Quadrado quadrado = new Quadrado(4);

        System.out.println("--- Formas Geométricas ---");
        circulo.exibirNome();
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println();

        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println();

        quadrado.exibirNome();
        System.out.println("Área: " + quadrado.calcularArea());
    }
}