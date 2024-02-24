package ejercicios;

import java.util.*;

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
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            matriz[i][j]=rand.nextInt() % 100;
            }
        }   
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println("\n");
            
        }
        return matriz;
    }
}
