package entities;

public class Quadrado {

    public static double getArea(double vertice){
        return Math.pow(vertice, 2);
    }
    public static double getPerimetro(double vertice){
        return  vertice*4;
    }
}

