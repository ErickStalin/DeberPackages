import geometria2D.*;
import java.lang.*;
import java.util.Scanner;

public class calcularPerimetrosAreas {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.1416;
    //Solicitud de datos mediante metodos
    public void mostrarCirculo(){
        //Atributos
        double radio, perimetro, area;
        System.out.print("Ingrese el radio del circulo:");
        radio = entrada.nextDouble();
        area = pi*(radio*radio);
        perimetro = 2*pi*radio;
        circulo miCirculo = new circulo(radio,perimetro,area);
        System.out.println("---DATOS DEL CIRCULO---");
        System.out.println("El perimetro del circulo es: " + miCirculo.getPerimetroCir());
        System.out.println("El area del circulo es: " + miCirculo.getAreaCir());
    }
    public void mostrarCuadrado(){
        double lado, area, perimetro;
        System.out.print("Ingrese el lado del cuadrado:");
        lado = entrada.nextDouble();
        area = lado*lado;
        perimetro = lado+lado+lado+lado;
        cuadrado miCuadrado = new cuadrado(lado,area,perimetro);
        System.out.println("---DATOS DEL CUADRADO---");
        System.out.println("El perimetro del cuadrado es: " + miCuadrado.getPerimetroCua());
        System.out.println("El area del cuadrado es: " + miCuadrado.getAreaCua());
    }
    public void mostrarHexagono(){
        double lado, area, perimetro, apotema;
        System.out.print("Ingrese el lado del hexagono:");
        lado = entrada.nextDouble();
        System.out.print("Ingrese la apotema del hexagono:");
        apotema = entrada.nextDouble();
        perimetro = 6*lado;
        area = (perimetro*apotema)/2;
        hexagono miHexagono = new hexagono(lado,perimetro,apotema,area);
        System.out.println("---DATOS DEL HEXAGONO---");
        System.out.println("El perimetro del hexagono es: " + miHexagono.getPerimetroHex());
        System.out.println("El area del hexagono es: " + miHexagono.getAreaHex());
    }
    public void mostrarPentagono(){
        double lado, perimetro, area, apotema;
        System.out.print("Ingrese el lado del pentagono:");
        lado = entrada.nextDouble();
        System.out.print("Ingrese la apotema del pentagono:");
        apotema = entrada.nextDouble();
        perimetro = lado * 5 * lado;
        area = (perimetro*apotema)/2;
        pentagono miPentagono = new pentagono(lado,perimetro,area,apotema);
        System.out.println("---DATOS DEL PENTAGONO---");
        System.out.println("El perimetro del pentagono es: " + miPentagono.getPerimetroPen());
        System.out.println("El area de la esfera es: " + miPentagono.getAreaPen());
    }
    public void mostrarTriangulo(){
        double lado, lado2, base, altura, area ,perimetro;
        System.out.print("Ingrese el lado 1 del triangulo:");
        lado = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del triangulo:");
        lado2 = entrada.nextDouble();
        System.out.print("Ingrese la base del triangulo:");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del triangulo:");
        altura = entrada.nextDouble();
        area = base*altura;
        perimetro = base+lado+lado2;
        triangulo miTriangulo = new triangulo(lado,lado2,base,altura,area,perimetro);
        System.out.println("---DATOS DEL TRIANGULO---");
        System.out.println("El perimetro del triangulo es: " + miTriangulo.getPeriTri());
        System.out.println("El area del triangulo es: " + miTriangulo.getAreaTri());
    }

}
