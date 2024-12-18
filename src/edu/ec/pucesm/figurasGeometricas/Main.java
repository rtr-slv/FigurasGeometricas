package edu.ec.pucesm.figurasGeometricas;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(5, 10);
        FiguraGeometrica triangulo = new Triangulo(6, 8);
        FiguraGeometrica circulo = new Circulo(4);

        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        // Comparar figuras
        System.out.println("El rectángulo es mayor que el triángulo: " + rectangulo.mayorQue(triangulo));
        System.out.println("El círculo es mayor que el triángulo: " + circulo.mayorQue(triangulo));
    }
}