package ejercicios;

import java.util.Scanner;
/*Escribir un programa que solicite al usuario dos vectores de N
elementos y que imprima su producto escalar. Utilice un array para
representar el vector de N elementos. Realice la entrada de usuario por
teclado en una función que reciba las dimensiones del vector a la que se
invoca dos veces (una por vector) y otra función que calcule el producto
escalar recibiendo dos arrays que representan dos vectores */

public class Ejercicio_9 {
    public static void main(String[] args) {
        int numLongitud;
        System.out.println("introduzca la dimension de sus vectores: ");
        Scanner leerDimension=new Scanner(System.in);
        numLongitud=leerDimension.nextInt();
        System.out.println("vector1:  ");
        int []vector1=pedirVectores(numLongitud);
        System.out.println("vector2: ");
        int []vector2=pedirVectores(numLongitud);
        int productoEscalar=prodEscalar(vector1, vector2,numLongitud);
        
        
    }

    public static int []pedirVectores(int N){
        int []vector=new int[N];
        for (int i=0; i<N;i++){
            System.out.println("introduzca el elemento en la posicion: "+i);
            Scanner leerelemento=new Scanner(System.in);
            vector[i]=leerelemento.nextInt(); 
        }
        return vector;
    }
    
    public static int prodEscalar(int []vector1, int []vector2, int N){
        int total=0;
        for(int i=0; i<N;i++){
            total+=vector1[i]*vector2[i];
        }
        System.out.println(total);
        return total;
    }
}
