public class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double areaCirculo(){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }

    public double perimetroCirculo(){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
}
