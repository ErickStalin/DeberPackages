import geometria2D.*;
import Geometria3D.*;
import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        calcularPerimetrosAreas dosD = new calcularPerimetrosAreas(); //Objetos de figuras en 2D
        calcularVolumenAreas tresD = new calcularVolumenAreas();//Objetos de las figuras en 3D
        escritura es1 = new escritura();
        int op = -1, op2;
        while(op != 0){
            op = es1.menu();
            switch (op){
                case 1:
                {
                    op2 = es1.menu2();
                    switch (op2){
                        case 1:
                        {
                            dosD.mostrarCirculo();
                        }
                        break;
                        case 2:
                        {
                            dosD.mostrarCuadrado();
                        }
                        break;
                        case 3:
                        {
                            dosD.mostrarHexagono();
                        }
                        break;
                        case 4:
                        {
                            dosD.mostrarPentagono();
                        }
                        break;
                        case 5:
                        {
                            dosD.mostrarTriangulo();
                        }
                        break;
                    }
                }
                break;
                case 2:
                {
                    op2 = es1.menu3();
                    switch (op2){
                        case 1:
                        {
                            tresD.mostrarCilindro();
                        }
                        break;
                        case 2:
                        {
                            tresD.mostrarCono();
                        }
                        break;
                        case 3:
                        {
                            tresD.mostrarCubo();
                        }
                        break;
                        case 4:
                        {
                            tresD.mostrarEsfera();
                        }
                        break;
                        case 5:
                        {
                            tresD.mostrarPrisma();
                        }
                        break;
                    }
                }
                break;
            }
        }

    }
}