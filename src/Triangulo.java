public class Triangulo {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaTriangulo(){
        double area = (base*altura)/2;
        return area;
    }

    public double perimetroTriangulo(){
        double perimetro = base+altura+hipotenusaTriangulo();
        return perimetro;
    }
    
    public double hipotenusaTriangulo(){
        double hipotenusa = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
        return hipotenusa;
    }

    void tipoTriangulo(){
        if (base == altura){
            System.out.println("Es un triangulo rectangulo isósceles");
        } else { System.out.println("Es un triangulo rectangulo escaleno");}
    }
}
