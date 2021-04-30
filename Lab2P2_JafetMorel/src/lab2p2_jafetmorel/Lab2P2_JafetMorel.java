/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_jafetmorel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 24661
 */
public class Lab2P2_JafetMorel {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Computadora> computadoras = new ArrayList();
        ArrayList<Computadora> gamers = new ArrayList();
        ArrayList<Computadora> educativas = new ArrayList();
        ArrayList<Computadora> pocouso = new ArrayList();
        while (opcion != 6) {
            System.out.println("1. Añadir computadora\n"
                    + "2. Listar todas las computadoras\n"
                    + "3. Eliminar computadora\n"
                    + "4. Modificar un aspecto de la computadora\n"
                    + "5. Informes\n"
                    + "6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el modelo: ");
                    String modelo = sc.next();
                    System.out.println("Ingrese el numero de serie: ");
                    int serie = sc.nextInt();
                    System.out.println("Ingrese el numero de GB de la capacidad de disco duro: ");
                    int disco = sc.nextInt();
                    System.out.println("Ingrese el tamaño de la pantalla: ");
                    int pantalla = sc.nextInt();
                    System.out.println("Tiene teclado númerico?[s/n]");
                    char c = sc.next().charAt(0);
                    boolean tnumerico;
                    if (c == 's' || c == 'S') {
                        tnumerico = true;
                    } else {
                        tnumerico = false;
                    }//fin else
                    System.out.println("Ingrese el tipo de prosecador(escribir sin espacios): ");
                    String procesador = sc.next();
                    System.out.println("Ingrese el tipo de tarjeta gráfica(normal/gamer): ");
                    String tgrafica = sc.next();
                    System.out.println("Ingrese el Sistema Operativo por defecto(Windows/ChromeOS): ");
                    String sistema = sc.next();
                    System.out.println("Ingrese el numero de horas que tardó en fabricarse: ");
                    int tiempo = sc.nextInt();
                    System.out.println("Ingrese el numero de milampirios de capacida de la batería: ");
                    int cbateria = sc.nextInt();
                    System.out.println("Ingrese el numero de horas de la duración de la batería: ");
                    int duracion = sc.nextInt();
                    computadoras.add(new Computadora(modelo, serie, disco, pantalla, tnumerico, procesador, tgrafica, sistema, tiempo, cbateria, duracion));
                    break;

                case 2:
                    for (int i = 0; i < computadoras.size(); i++) {
                        System.out.print(i + ". " + computadoras.get(i) + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el número de serie de la computadora que desea eliminar");
                    int eliminar = sc.nextInt();
                    for (int i = 0; i < computadoras.size(); i++) {
                        if (computadoras.get(i).getNumeroserie() == eliminar) {
                            computadoras.remove(i);
                            break;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el número de serie de la computadora que desea eliminar");
                    int modificar = sc.nextInt();
                    for (int i = 0; i < computadoras.size(); i++) {
                        if (computadoras.get(i).getNumeroserie() == modificar) {
                            System.out.println("Que desea modificar:\n"
                                    + "1. Modelo\n"
                                    + "2. Capacidad de disco duro\n"
                                    + "3. Tamaño de pantalla\n"
                                    + "4. Teclado númerico\n"
                                    + "5. Procesador\n"
                                    + "6. Tarjeta grafica\n"
                                    + "7. Sistema operativo\n"
                                    + "8. Tiempo de fábrica\n"
                                    + "9. Capacidad de batería\n"
                                    + "10. Duración de batería");
                            int mod = sc.nextInt();
                            switch (mod) {
                                case 1:
                                    System.out.println("Ingrese el modelo: ");
                                    String newmodelo = sc.next();
                                    computadoras.get(i).setModelo(newmodelo);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la cantidad de GB de capacidad de disco duro: ");
                                    int newdisco = sc.nextInt();
                                    computadoras.get(i).setCapdisco(newdisco);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el tamaño de la pantalla");
                                    int newtamaño = sc.nextInt();
                                    computadoras.get(i).setPantalla(newtamaño);
                                    break;
                                case 4:
                                    System.out.println("Es el teclado numérico? [s/n]");
                                    char d = sc.next().charAt(0);
                                    boolean newteclado = false;
                                    if (d == 's' || d == 'S') {
                                        newteclado = true;
                                    }
                                    computadoras.get(i).setTnumerico(newteclado);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el procesador: ");
                                    String newproc = sc.nextLine();
                                    computadoras.get(i).setProcesador(newproc);
                                    break;
                                case 6:
                                    System.out.println("Ingrese el tipo de tarjeta gráfica [normal/gamer]: ");
                                    String newtg = sc.next();
                                    computadoras.get(i).setTgrafica(newtg);
                                    break;
                                case 7:
                                    System.out.println("Ingrese sistema operativo[Windows/ChromeOS]: ");
                                    String newsis = sc.next();
                                    computadoras.get(i).setSistema(newsis);
                                    break;
                                case 8:
                                    System.out.println("Ingrese cuantas horas se tardó en fabricarse: ");
                                    int newtiempo = sc.nextInt();
                                    computadoras.get(i).setTiempo(newtiempo);
                                    break;
                                case 9:
                                    System.out.println("Ingrese la cantidad de milampirios que tiene de capacidad la batería");
                                    int newbat = sc.nextInt();
                                    computadoras.get(i).setCapbateria(newbat);
                                    break;
                                case 10:
                                    System.out.println("Ingrese la cantidad de horas de duración de baterías: ");
                                    int newhorbat = sc.nextInt();
                                    computadoras.get(i).setDuracion(newhorbat);
                                    break;
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Que desea ver: \n"
                            + "1. Computadoras gamers\n"
                            + "2. Computadoras educativas\n"
                            + "2. Computadoras de poco uso");
                    int informe = sc.nextInt();
                    if (informe == 1) {
                        System.out.println("Las computadoras gamers son las siguientes");
                        for (int i = 0; i < computadoras.size(); i++) {
                            if ((computadoras.get(i).getTgrafica() == "gamer" || computadoras.get(i).getTgrafica() == "Gamer" || computadoras.get(i).getTgrafica() == "GAMER") & computadoras.get(i).getPantalla() > 17 & computadoras.get(i).isTnumerico() == true) {
                                System.out.print(computadoras.get(i) + "\n");
                            }
                        }
                    } else if (informe == 2) {
                        System.out.println("Las computadoras educativas las siguientes");
                        for (int i = 0; i < computadoras.size(); i++) {
                            if (computadoras.get(i).getPantalla() < 13 & computadoras.get(i).getCapdisco() < 300 & computadoras.get(i).getSistema() == "ChromeOs") {
                                System.out.print(computadoras.get(i) + "\n");
                            }
                        }
                    } else if (informe == 3) {
                        System.out.println("Las computadoras de poco uso son las siguientes");
                        for (int i = 0; i < computadoras.size(); i++) {
                            if (computadoras.get(i).getDuracion() < 1 & computadoras.get(i).getTiempo() < 2 & computadoras.get(i).getSistema() == "Windows") {
                                System.out.print(computadoras.get(i) + "\n");
                            }
                        }
                    } else {
                        System.out.println("Número de informe no válido");
                    }

            }
        }
    }

}
