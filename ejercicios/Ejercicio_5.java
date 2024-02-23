package ejercicios;
import java.util.Scanner;
/*Escribe un programa que visualice por pantalla la tabla de
multiplicar de los 10 primeros números naturales. Utilizar una función que
reciba un número N y devuelva un array de arrays con las tablas de
multiplicar de 0 a 9 de los N números */
public class Ejercicio_5 {
    public static void main(String[] args) {
        int num;
        System.out.println("introduzca  un numero: ");
        Scanner leer=new Scanner(System.in);
        num=leer.nextInt();
        int [][]todasTablas=tablasNum(num);

    }

    public static int [][]tablasNum (int N){
        int[][]tablas=new int[10][100];
        for (int j=1;j<=N;j++){
            System.out.println("la tabla del "+j+" es:");
            for(int i=1;i<=10;i++){
            tablas[j][i]=i*j;
            System.out.println(j+"*"+i+"="+tablas[j][i]);
        }
    }
        
        return tablas;
        
    }
}

