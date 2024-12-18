package edu.ec.pucesm.figurasGeometricas;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo con base " + base + ", altura " + altura + " y área: " + calcularArea();
    }
}
