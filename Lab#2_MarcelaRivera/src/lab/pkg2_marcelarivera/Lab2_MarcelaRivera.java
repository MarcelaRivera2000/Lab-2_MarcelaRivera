package lab.pkg2_marcelarivera;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_MarcelaRivera {

    public static Random r = new Random();

    public static Scanner leer = new Scanner(System.in);
    static String tipo, name, raza, descripcion, nacionalidad;
    static double estatura, peso;
    static int edad;
    static Personajes p = new Personajes();
    static ArrayList<Personajes> historial = new ArrayList();

    
    public static void main(String[] args) {
        P_Creados();
        while (true) {
            System.out.println("1.Creacion de personajes\n2.Modificar personajes\n3.Ver atributos de un personaje\n4.Eliminar Personajes\n5.Combate\n6.Salir");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    creacion();
                    Personajes per = new Personajes(tipo, name, raza, descripcion, nacionalidad, estatura, peso, edad);
                    historial.add(per);
                    System.out.println(per.toString());
                    break;
                case 2:
                    System.out.println("Cual es la posicion del personaje que dessea modificar: ");
                    int posi = leer.nextInt();
                    creacion();
                    historial.set(posi, new Personajes());
                    break;
                case 3:
                    for (Object h : historial) {
                        System.out.println(h);
                    }
                    break;
                case 4:
                    System.out.println("Cual es la posicion del personaje que dessea eliminar: ");
                    posi = leer.nextInt();
                    historial.remove(posi);
                    break;
                case 5:
                    play();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }

        }

    }

    public static void play() {
        System.out.println("Cual es la posicion del personaje con el que desea jugar:  ");
        int posi = leer.nextInt();
        Personajes J1 = historial.get(posi);
        int AC1 = ArmorClass(J1.getTipo());
        int DG1 = Damage(J1.getTipo());
        int HP1 = Hitpoint(J1.getRaza());
        int compu = 0 + r.nextInt(historial.size());
        Personajes C2 = historial.get(compu);
        int AC2 = ArmorClass(C2.getTipo());
        int DG2 = Damage(C2.getTipo());
        int HP2 = Hitpoint(C2.getRaza());
        int ACC1 = AC1;
        int ACC2 = AC2;
        System.out.println("****EL JUEGO A COMENZADO****");
        int golpe;
        System.out.println("TU PERSONAJE: ");
        historial.get(posi).toString();
        System.out.println("EL PERSONAJE DE LA COMPUTADORA: ");
        historial.get(compu).toString();
        System.out.println("");
        while (sigue(HP1, HP2)) {
            System.out.println("\n********Jugaror********");
            System.out.println("Jugador que desea haces?\n1.Atacar\n2.Defender");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    int ataque = 1 + r.nextInt(100);
                    if (ataque > CriticS(J1.getTipo())) {
                        golpe = ArmorClass(J1.getTipo()) * 2;
                    } else {
                        golpe = ArmorClass(J1.getTipo());
                    }
                    HP2 -= golpe;
                    System.out.println("Se le bajo " + golpe + " de vida, al enemigo aun tiene " + HP2);
                    break;
                case 2:
                    AC1 += 15;
                    System.out.println("Ahora tienes " + AC1 + " de AC");
                    break;
            }
            if (sigue(HP1, HP2) == false) {
                break;
            }
            AC2 = ACC2;
            int opC = 1 + r.nextInt(2);
            System.out.println("\n********Computador********");
            switch (opC) {
                case 1:
                    System.out.println("La computadora decidio atacar");
                    int ataque = 1 + r.nextInt(100);
                    if (ataque > CriticS(C2.getTipo())) {
                        golpe = ArmorClass(C2.getTipo()) * 2;
                    } else {
                        golpe = ArmorClass(C2.getTipo());
                    }
                    HP1 -= golpe;
                    System.out.println("El enemigo le bajo " + golpe + " de vida, aun tienes" + HP1);

                    break;
                case 2:
                    System.out.println("La computadora decidio defender");
                    AC2 += 15;
                    System.out.println("Ahora tiene " + AC2 + " de AC");
                    break;
            }
            AC1 = ACC1;
        }
    }

    public static boolean sigue(int HP1, int HP2) {
        if (HP1 <= 0 || HP2 <= 0) {
            if (HP1 <= 0) {
                System.out.println("*****Usted perdio,suerte la proxima****");
            } else {
                System.out.println("*****Usted gano,FELICIDADES****");
            }
            return false;
        } else {
            return true;
        }
    }

    public static void creacion() {
        System.out.println("Elija su personaje:\n1.Clérigo\n2.Bárbaro\n3.Mago\n4.Pícaro.");
        int opp = leer.nextInt();
        switch (opp) {
            case 1:
                tipo = "clerigo";
                break;
            case 2:
                tipo = "barbaro";
                break;
            case 3:
                tipo = "mago";
                break;
            case 4:
                tipo = "picaro";
                break;
        }
        System.out.println("Nombre de su personaje: ");
        name = leer.next();
        System.out.println("Elija una raza:\n1.Mediano\n2.Enano\n3.Elfo\n4.Humano");
        opp = leer.nextInt();
        switch (opp) {
            case 1:
                raza = "mediano";
                break;
            case 2:
                raza = "enano";
                break;
            case 3:
                raza = "elfo";
                break;
            case 4:
                raza = "humano";
                break;
        }
        System.out.println("Estatura de su personaje: ");
        estatura = leer.nextDouble();
        System.out.println("Peso de su personaje: ");
        peso = leer.nextDouble();
        System.out.println("Edad de su personaje: ");
        edad = leer.nextInt();
        System.out.println("Descripcion: ");
        descripcion = leer.nextLine();
        System.out.println("Elija una acionalidad:\n1.Norfair\n2.Brinstar\n3.Maridia\n4.Zebes\n5.Crateria ");
        opp = leer.nextInt();
        switch (opp) {
            case 1:
                nacionalidad = "Norfair";
                break;
            case 2:
                nacionalidad = "Brinstar";
                break;
            case 3:
                nacionalidad = "Maridia";
                break;
            case 4:
                nacionalidad = "Zebes";
                break;
            case 5:
                nacionalidad = "Crateria";
                break;
        }
    }

    public static int Hitpoint(String raza) {
        int HP = 0;
        switch (raza) {
            case "mediano":
                HP = 50 + r.nextInt(60);
                break;
            case "enano":
                HP = 80 + r.nextInt(100);
                break;
            case "elfo":
                HP = 50 + r.nextInt(70);
                break;
            case "humano":
                HP = 40 + r.nextInt(75);
                break;
        }
        return HP;
    }

    public static int Damage(String tipo) {
        int D = 0;
        switch (tipo) {
            case "clerigo":
                D = 5 + r.nextInt(15);
                break;
            case "barbaro":
                D = 15 + r.nextInt(30);
                break;
            case "mago":
                D = 5 + r.nextInt(10);
                break;
            case "picaro":
                D = 15 + r.nextInt(25);
                break;
        }
        return D;
    }

    public static int ArmorClass(String tipo) {
        int D = 0;
        switch (tipo) {
            case "clerigo":
                D = 40;
                break;
            case "barbaro":
                D = 65;
                break;
            case "mago":
                D = 20;
                break;
            case "picaro":
                D = 50;
                break;
        }
        return D;
    }

    public static int CriticS(String tipo) {
        int D = 0;
        switch (tipo) {
            case "clerigo":
                D = 97;
                break;
            case "barbaro":
                D = 93;
                break;
            case "mago":
                D = 101;
                break;
            case "picaro":
                D = 80;
                break;
        }
        return D;
    }

    public static void P_Creados() {
        /*String tipo, String name, String raza, String descripcion, String nacionalidad, double estatura, double peso, int edad*/
        historial.add(new Personajes("mago", "pedro", "mediano", "Hombre grande", "Brinstar", 1.50, 56.00, 78));
        historial.add(new Personajes("Picaro", "pedrox2", "enano", "Hombre pequeño", "Norfair", 1.30, 43.00, 18));
        historial.add(new Personajes("Clerigo", "pedrina", "humano", "mujer mediana", "Zebes", 1.60, 16.00, 34));
        historial.add(new Personajes("Barbaro", "juana", "mediano", "mujer grande", "Crateria", 1.90, 110.00, 78));
    }
}
