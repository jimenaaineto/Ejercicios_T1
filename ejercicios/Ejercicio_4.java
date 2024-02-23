package ejercicios;
/*escribe un programa que calcule el mínimo y el máximo de
una lista de números enteros positivos introducidos por el usuario. La lista
finalizará cuando se introduzca un número negativo.  */
import java.util.Scanner;

public class Ejercicio_4{
    public static void main(String[] args) {
        int num;
        int max=0;
        int min=0;
        System.out.println("introduzca tantos numeros como quiera. una vez no desee introducir mas, introduzca un un numero negativo");
       do{ 
        Scanner leer=new Scanner(System.in);
        System.out.println("numero: ");
        num=leer.nextInt();
        
        if(num<min){
            min=num;
        }else if(num>max){
            max=num;
        }
        
      }while(num>=0);
        System.out.println("el maximo es: "+max);
        System.out.println("el minimo es: "+min);
      
       
    }

    }