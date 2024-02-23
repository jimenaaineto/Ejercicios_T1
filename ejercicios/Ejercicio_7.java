package ejercicios;

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
    

