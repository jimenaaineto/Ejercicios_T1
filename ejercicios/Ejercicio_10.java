package ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int dimension;
        System.out.println("de que dimension desea su matriz cuadrada?");
        Scanner leerDimension= new Scanner(System.in);
        dimension=leerDimension.nextInt();
        int [][]mostrarMatriz=rellenarMatriz(dimension);
        
    }
    
    public static int[][]rellenarMatriz(int N){
        int [][]matriz=new int[N][N];
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            System.out.println("introduzca un numero para la posicion: "+i+""+j);
            Scanner darValores=new Scanner(System.in);
            matriz[i][j]=darValores.nextInt();
            }
        
        }   
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println(" ");
        }

        return matriz;
    }
}
