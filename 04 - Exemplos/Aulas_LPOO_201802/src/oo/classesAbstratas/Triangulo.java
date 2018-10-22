package oo.classesAbstratas;

public class Triangulo extends FormaGeometrica {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = (this.base * this.altura)/2;
    }
       
}
