/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author adrianosorio
 */
public class Estaturas2 {
    static double numero;
    static double media;
    static double varianza;
    static double desviacion;
    static int n;
    static double maximo;
    static double minimo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de numeros a calcular: ");
        n = sc.nextInt();
        
        double numeros [] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero : ");
            numeros[i] = sc.nextDouble();
        }
        
        //Calcular Media
        double suma = 0;
        for (double i: numeros) {
            suma = suma + i;
        }
        
        media = suma / n;
        System.out.println("La Media Es: "+media);
        
        //Calcular la varianza
        double sumatoria;
        for (int i = 0; i < n; i++) {
            sumatoria = Math.pow(numeros[i] - media,2);
            varianza = varianza + sumatoria;
        }
        varianza = varianza / (n-1);
        
        //Calcular la Desviacion Estandar
        desviacion = Math.sqrt(varianza);
        double redondeo = Math.rint(desviacion*100)/100;
        System.out.println("La Desviacion Estandar Es: "+redondeo);

        // Calcular el valor máximo y mínimo
        maximo = numeros[0];
        minimo = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
    }
    
}
