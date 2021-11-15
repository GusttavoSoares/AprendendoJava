package Arquivos.TreinoConstrutores;

public class Retangulo {
    public int altura;
    public int base;

    public Retangulo() {
    }

    public Retangulo(int base) {
        this.base = base;
        this.altura = base;
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return altura * base;
    }

    public double calcularPerimetro() {
        return 2 * (altura + base);
    }
}