/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_burbuja;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class Metodo_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] arreglo;
        int numero;
        System.out.println("Ingrese la cantidad de numeros que cabran en su arreglo: ");
        numero = leer.nextInt();
        int aux;
        arreglo = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("[" + i + "]" + "Ingrese un numero: ");
            arreglo[i] = leer.nextInt();

        }
        // metodo burbuja 
        for (int i = 0; i < numero - 1; i++) {
            for (int j = 0; j < numero - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) { // si numero actual > numero siguiente cambie, sino siga ; 
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
            

        }
        // muestra el arreglo ordenado de forma creciente ; 

        System.out.println("\n arreglo ordenado de forma creciente ");
        for (int m = 0; m < numero; m++) {
            System.out.print(arreglo[m] + "-");
        }
        System.out.println("");

        System.out.println("\n arreglo ordenado de forma decreciente ");
        for (int i = numero - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + "-");
        }
        System.out.println();

        System.out.println("Ingrese las filas: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese las columnas: ");
        int columnas = leer.nextInt();

        int[][] matriz_dos = new int[filas][columnas];
        Random ale = new Random();
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = 1 + ale.nextInt(10);
                System.out.print(matriz_dos[i][j]+"\t");

            }
            System.out.println("");
        }

        int[] array = new int[matriz_dos.length];

        for (int i = 0; i < matriz_dos.length; i++) {
            int mayor = matriz_dos[i][0];
            for (int j = 0; j < matriz_dos[i].length; j++) {
                if (matriz_dos[i][j] >= mayor) {
                    mayor = matriz_dos[i][j];
                }
            }
            array[i] = mayor;
        }

        System.out.println("");
        int moom;
        for (int i = 0; i < matriz_dos.length; i++) {
            System.out.println(array[i] + "\t");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    moom = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = moom;

                }
            }
        }
        System.out.println("La forma ordenada es esta ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println("");
        System.out.println("La forma en orden inverso es");
        
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+"-");
            
        }

	System.out.println("ARIEL ES UN PUTO");

    }

}
