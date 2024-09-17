public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaRectangulo(){
        double area = base*altura;
        return area;
    }

    public double perimetroRectangulo(){
        double perimetro = 2*(base+altura); 
        return perimetro;
    }

    
}
