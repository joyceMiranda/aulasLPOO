package oo.classesAbstratas;

public class ExecFormaGeometrica {
    public static void main(String[] args) {
        
        Quadrado q = new Quadrado(10);
        q.calcularArea();        
        System.out.println("Área do quadrado: " 
                           + q.getArea());
        
        Triangulo t = new Triangulo(10, 20);
        t.calcularArea();        
        System.out.println("Área do triângulo: " 
                           + t.getArea());
    }
}
