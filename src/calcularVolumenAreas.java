import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;

public class calcularVolumenAreas {
    Scanner entrada = new Scanner(System.in);
    double pi = 3.2426;
    //Solicitud de datos mediante metodos
    public void mostrarCono(){
        //Atributos
        double radio, generatriz, area, volumen, altura;
        System.out.print("Ingrese el radio del cono:");
        radio = entrada.nextDouble();
        System.out.print("Ingrese la generatiz del cono:");
        generatriz = entrada.nextDouble();
        System.out.print("Ingrese la altura del cono:");
        altura = entrada.nextDouble();
        area = pi * (radio*radio) + pi * radio * generatriz;
        volumen = (pi*(radio*radio)*area)/3;
        cono miCono = new cono(radio,generatriz,area ,volumen); //Objetos de los packages
        System.out.println("---DATOS DEL CONO---");
        System.out.println("El volumen del cono es: " + miCono.getVolumenCo());
        System.out.println("El area del cono es: " + miCono.getAreaCo());
    }
    public void mostrarCilindro(){
        double radio, area, volumen, altura;
        System.out.print("Ingrese el radio del cilindro:");
        radio = entrada.nextDouble();
        System.out.print("Ingrese la altura del cilindro:");
        altura = entrada.nextDouble();
        area = 2*pi*radio*(altura+radio);
        volumen = (pi*(radio*radio))*altura;
        cilindro miCilindro = new cilindro(altura,radio,area,volumen);
        System.out.println("---DATOS DEL CILINDRO---");
        System.out.println("El volumen del cilindor es es: " + miCilindro.getVolumenCil());
        System.out.println("El area del cilindor es: " + miCilindro.getAreaCil());
    }
    public void mostrarCubo(){
        double area, volumen, lado;
        System.out.print("Ingrese el lado del cubo:");
        lado = entrada.nextDouble();
        area = 6*(lado*lado);
        volumen = (lado*lado*lado);
        cubo miCubo = new cubo(lado,area,volumen);
        System.out.println("---DATOS DEL CUBO---");
        System.out.println("El volumen del cubo es es: " + miCubo.getVolumenCu());
        System.out.println("El area del cubo es: " + miCubo.getAreaCu());
    }
    public void mostrarEsfera(){
        double radio, area , volumen;
        System.out.print("Ingrese el radio de la esfera:");
        radio = entrada.nextDouble();
        area = 4*pi*(radio*radio);
        volumen = (1.33)*pi*(radio*radio*radio);
        esfera miEsfera = new esfera(radio,area,volumen);
        System.out.println("---DATOS DEL ESFERA---");
        System.out.println("El volumen de la esfera es es: " + miEsfera.getVolumenEs());
        System.out.println("El area de la esfera es: " + miEsfera.getAreaEs());
    }
    public void mostrarPrisma(){
        double perimetroB, altura, areaB, area, volumen, apotemaLado;
        System.out.print("Ingrese el perimetro de la base del prisma:");
        perimetroB = entrada.nextDouble();
        System.out.print("Ingrese la altura del prisma:");
        altura = entrada.nextDouble();
        System.out.print("Ingrese el area de la base del prisma:");
        areaB = entrada.nextDouble();
        System.out.print("Ingrese el apotema del lado del prisma:");
        apotemaLado = entrada.nextDouble();
        area = ((perimetroB*apotemaLado)/2)+areaB;
        volumen = (areaB*altura)/3;
        prisma miPrisma = new prisma(perimetroB,altura,areaB,area,volumen,apotemaLado);
        System.out.println("---DATOS DEL PRISMA---");
        System.out.println("El volumen del prisma es: " + miPrisma.getVolumenPri());
        System.out.println("El area del prisma es: " + miPrisma.getAreaPri());
    }
}
