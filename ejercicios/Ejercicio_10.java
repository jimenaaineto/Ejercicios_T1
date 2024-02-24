package ejercicios;

import java.util.*;
/*Escribir un programa que rellene una matriz cuadrada (las
dimensiones de la matriz serán un parámetro que se pida al usuario) con
números aleatorios de tal modo que la matriz sea simétrica. Imprimir la
matriz por pantalla. Realice todo en una única función a la que se llama
desde el main. */

public class Ejercicio_10 {
    public static void main(String[] args) {
        int dimension;
        System.out.println("de que dimension desea su matriz cuadrada?");
        Scanner leerDimension= new Scanner(System.in);
        dimension=leerDimension.nextInt();
        int [][]mostrarMatriz=rellenarMatriz(dimension);
        
    }
    
    public static int[][]rellenarMatriz(int N){
        Random rand = new Random();
        int [][]matriz=new int[N][N];
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
            matriz[i][j]=rand.nextInt() % 100;
            }
        }   
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.println(matriz[i][j]+"");
            }
            System.out.println();
            
        }
        return matriz;
    }
}
