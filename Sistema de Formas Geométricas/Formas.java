class Forma {
    String nome;

    Forma(String nome) {
        this.nome = nome;
    }

    void exibirNome() {
        System.out.println("Forma: " + nome);
    }
}

class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    double calcularArea() {
        return 3.14 * (raio * raio);
    }
}

class Retangulo extends Forma {
    double largura, altura;

    Retangulo(double largura, double altura) {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea() {
        return largura * altura;
    }
}

class Quadrado extends Retangulo {
    Quadrado(double lado) {
        super(lado, lado);
        this.nome = "Quadrado";
    }
}

public class Formas {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 6);
        Quadrado q = new Quadrado(4);

        System.out.println("--- Formas Geométricas ---");
        c.exibirNome();
        System.out.println("Área: " + c.calcularArea());
        System.out.println();

        r.exibirNome();
        System.out.println("Área: " + r.calcularArea());
        System.out.println();

        q.exibirNome();
        System.out.println("Área: " + q.calcularArea());
    }
}
