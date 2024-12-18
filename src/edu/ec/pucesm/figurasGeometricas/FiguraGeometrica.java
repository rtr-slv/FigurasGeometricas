package edu.ec.pucesm.figurasGeometricas;

public abstract class FiguraGeometrica {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método para comparar si esta figura es mayor que otra
    public boolean mayorQue(FiguraGeometrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    // Método toString para representar la figura como cadena
    @Override
    public String toString() {
        return "FiguraGeometrica con área: " + calcularArea();
    }
}