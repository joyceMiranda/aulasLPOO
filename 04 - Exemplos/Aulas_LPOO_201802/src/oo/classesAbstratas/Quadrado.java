package oo.classesAbstratas;

public class Quadrado extends FormaGeometrica {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }
    
    

    
    
}
