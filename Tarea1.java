/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author josep_wht3r4a
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int sumatoria = 0;
        int sumatoria1 = 0;
        int cont = 1;
        int[][] matriz = new int[3][3];

        // Mtariz de izquierda a derecha 
        for (int i = 0; i < 3; i++) { //filas 0
            for (int j = 0; j < 3; j++) { // columnas 0 1 2
                if (i == 0 && j == 0) {
                    sumatoria += cont;
                }
                if (i == 1 && j == 1) {
                    sumatoria += cont;
                }
                if (i == 2 && j == 2) {
                    sumatoria += cont;
                }

                matriz[i][j] = cont++;
            }

        }
        System.out.println("sumatoria fila diagonal izquierda a derecha: " + sumatoria);

        // Mtariz de derecha a izquierda
        cont = 1;
        for (int i = 0; i < 3; i++) { //filas 0
            for (int j = 0; j < 3; j++) { // columnas 0 1 2
                if (i == 0 && j == 2) {
                    sumatoria1 += cont;
                }
                if (i == 1 && j == 1) {
                    sumatoria1 += cont;
                }
                if (i == 2 && j == 0) {
                    sumatoria1 += cont;
                }
                matriz[i][j] = cont++;
            }
        }
        total = sumatoria + sumatoria1;
        System.out.println("sumatoria fila diagonal derecha a izquierda: " + sumatoria1);
        System.out.println("Sumatoria de las dos diagonales: " + total);

        /// imprimir la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");

        }
    }
    
}
