/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoburbujamejorado;

/**
 *
 * @author angel angelino gonzalez
 */
public class MetodoBurbujaMejorado {

    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 1, 5, 6};
       System.out.print("Arreglo desordenado: ");
       
       for (int i = 0; i < arreglo.length; i++) {
         System.out.print(arreglo[i] + " ");
        }
       System.out.println();
       
         ordenamientoBurbujaMejorado(arreglo);
       
       System.out.print("Arreglo ordenado: ");
       for (int i = 0; i < arreglo.length; i++) {
          System.out.print(arreglo[i] + " ");
       }
       System.out.println();
    }
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
       int n = arreglo.length;
       boolean nohubocambio;
       for (int i = 0; i < n - 1; i++) {
           nohubocambio=true;
           for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                   int temp = arreglo[j];
                   arreglo[j] = arreglo[j + 1];
                   arreglo[j + 1] = temp;
                   
                   nohubocambio=false;
                }
            }
           if(nohubocambio){
               break;
           }
        }
    }
}
