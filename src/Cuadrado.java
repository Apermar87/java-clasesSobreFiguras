public class Cuadrado {
    double lado;

    public Cuadrado(double longitud) {
        this.lado = longitud;
    }

    public double areaCuadrado(){
        double area = Math.pow(lado, 2);
        return area;
    }

    public double perimetroCuadrado(){
        double perimetro = 4*lado;
        return perimetro;
    }
    
}
