public class App {
    public static void main(String[] args) throws Exception {
        Circulo f1 = new Circulo(6);
        Rectangulo f2 = new Rectangulo(4, 6);
        Cuadrado f3 = new Cuadrado(5);
        Triangulo f4 = new Triangulo(5, 4);

       System.out.println("El area del circulo es = " + f1.areaCirculo());
       System.out.println("El perimetro del circulo es = " + f1.perimetroCirculo() + "\n");

       System.out.println("El area de un rectangulo es = " + f2.areaRectangulo());
       System.out.println("El perimetro del rectangulo es = " + f2.perimetroRectangulo() + "\n");

       System.out.println("El area de un cuadrado es = " + f3.areaCuadrado());
       System.out.println("El perimetro de un cuadrado es = " + f3.perimetroCuadrado() + "\n");

       System.out.println("El area de un triangulo es = " + f4.areaTriangulo());
       System.out.println("El perimetro de un triangulo es = " + f4.perimetroTriangulo());
       System.out.println("La hipotenusa de un triangulo es = " + f4.hipotenusaTriangulo());
       f4.tipoTriangulo();
    }
}
