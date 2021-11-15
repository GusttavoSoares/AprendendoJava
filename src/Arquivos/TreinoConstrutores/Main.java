package Arquivos.TreinoConstrutores;

import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        DecimalFormat numero = new DecimalFormat("#.00");

        // Criando um objeto (instância) da classe Quadrado e por meio do construtor atribuindo o valor 5 ao atributo lado
        Quadrado q1 = new Quadrado(5);


        System.out.println(q1.lado);
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());

        System.out.println("-----------");

        // Usando o construtor Quadrado que não tem nenhum parâmetro
        Quadrado q2 = new Quadrado();
        q2.lado = 10;

        System.out.println(q2.lado);
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());


        System.out.println("Retangulo 1");
        // Usando o construtor Retangulo que possui base e altura
        Retangulo retangulo1 = new Retangulo(7, 5);


        System.out.println(retangulo1.calcularArea());
        System.out.println(retangulo1.calcularPerimetro());

        // Usando o construtor Retangulo que não tem nenhum parâmetro
        System.out.println("Retangulo 2");
        Retangulo retangulo2 = new Retangulo();
        retangulo2.base = 6;
        retangulo2.altura = 2;

        System.out.println(retangulo2.calcularArea());
        System.out.println(retangulo2.calcularPerimetro());

        // Usando o construtor que tem apenas a base como parâmetro
        System.out.println("Retangulo 3");
        Retangulo retangulo3 = new Retangulo(7);


        System.out.println(retangulo3.calcularArea());
        System.out.println(retangulo3.calcularPerimetro());


        // Usando o construtor Circulo que possui raio como parâmetro
        System.out.println("Circulo 1");
        Circulo circulo1 = new Circulo(3);


        System.out.println(numero.format(circulo1.calcularArea()));
        System.out.println(numero.format(circulo1.calcularPerimetro()));

        // Usando o construtor Circulo que não possui parâmetro
        System.out.println("Circulo 2");
        Circulo circulo2 = new Circulo();
        circulo2.raio = 9;

        System.out.println(numero.format(circulo2.calcularArea()));
        System.out.println(numero.format(circulo2.calcularPerimetro()));


        // Usando o construtor Circulo que possui raio
        System.out.println("Circulo 3");
        Circulo circulo3 = new Circulo(5);

        System.out.println(numero.format(circulo3.calcularArea()));
        System.out.println(numero.format(circulo3.calcularPerimetro()));
    }
}
