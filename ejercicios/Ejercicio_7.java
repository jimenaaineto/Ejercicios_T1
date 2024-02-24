package ejercicios;
/*Escribe un programa que lea un número entero de teclado, lo
guarde en una variable, lo envíe a una función que lo descomponga en
factores primos, y dicha función devuelva un array que contenga los factores
primos. Posteriormente imprima el array en el main. ; por ejemplo 40 = 2 * 2
* 2 * 5. */

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int N;
        System.out.println("introduzca un numero a descomponer: ");
        Scanner leer=new Scanner(System.in);
        N=leer.nextInt();
        int[]factorizar=descomposicion(N);
        System.out.println(factorizar);
        
    }

    public static int []descomposicion(int num){
        int[]desc=new int[num];
        System.out.println(num+" se descompone en: ");
        for (int i=1;i<num;i++){
                if(num%i==0){

                desc[i]=i;
                System.out.println(desc[i]+"*");
                }else{
                    
                    continue;
                    }
        }return desc;
        }
        
    }
    

