package lab.pkg2_marcelarivera;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_MarcelaRivera {

    public static Scanner leer = new Scanner(System.in);
    static String tipo, name, raza, descripcion, nacionalidad;
    static double estatura, peso;
    static int edad;

    public static void main(String[] args) {
        ArrayList<Personajes> historial = new ArrayList();
        while (true) {
            System.out.println("1.Creacion de personajes\n2.Modificar personajes\n3.Ver atributos de un personaje\n4.Eliminar Personajes\n5.Combate\n6.Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                   creacion();
                     historial.add(new Personajes( tipo,  name,  raza,  descripcion,  nacionalidad,  estatura,  peso,  edad));
                    break;
                case 2:
                    System.out.println("Cual es la posicion del personaje que dessea modificar: ");
                    int posi=leer.nextInt();
                    creacion();
                    

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;

            }

        }

    }
    
    public static void creacion(){
         System.out.println("Elija su personaje:\n1.Clérigo\n2.Bárbaro\n3.Mago\n4.Pícaro.");
                    int opp = leer.nextInt();
                    switch (opp) {
                        case 1:
                            tipo="clerigo";
                            break;
                        case 2:
                            tipo="barbaro";
                            break;
                        case 3:
                            tipo="mago";
                            break;
                        case 4:
                            tipo="picaro";
                            break;
                    }
                    System.out.println("Nombre de su personaje: ");
                    name=leer.next();
                    System.out.println("Elija una raza:\n1.Mediano\n2.Enano\n3.Elfo\n4.Humano");
                     opp = leer.nextInt();
                     switch (opp) {
                        case 1:
                            raza="mediano";
                            break;
                        case 2:
                            raza="enano";
                            break;
                        case 3:
                            raza="elfo";
                            break;
                        case 4:
                            raza="humano";
                            break;
                    }
                     System.out.println("Estatura de su personaje: ");
                     estatura=leer.nextDouble();
                     System.out.println("Peso de su personaje: ");
                     peso=leer.nextDouble();
                     System.out.println("Edad de su personaje: ");
                     edad=leer.nextInt();
                     System.out.println("Descripcion: ");
                     descripcion=leer.nextLine();
                     System.out.println("Elija una acionalidad:\nNorfair\nBrinstar\nMaridia\nZebes\nCrateria ");
                      opp = leer.nextInt();
                     switch (opp) {
                        case 1:
                            nacionalidad="Norfair";
                            break;
                        case 2:
                            nacionalidad="Brinstar";
                            break;
                        case 3:
                            nacionalidad="Maridia";
                            break;
                        case 4:
                            nacionalidad="Zebes";
                            break;
                        case 5:
                            nacionalidad="Crateria";
                            break; 
                    }
    }

}
