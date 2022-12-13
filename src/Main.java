import geometria2D.*;
import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, generatriz, area, volumen, altura, lado;
        System.out.print("Ingrese el radio del cono:");
        radio = entrada.nextDouble();
        System.out.print("Ingrese la generatiz del cono:");
        generatriz = entrada.nextDouble();
        System.out.print("Ingrese el area del cono:");
        area = entrada.nextDouble();
        System.out.print("Ingrese el volumen del cono:");
        volumen = entrada.nextDouble();
        cono miCono = new cono(radio,generatriz,area ,volumen);
        System.out.println(miCono.getAreaCo());
    }
}