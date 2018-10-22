package oo.classesAbstratas;

public abstract class FormaGeometrica {
    
    protected double area;
    
    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
