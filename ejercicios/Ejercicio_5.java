package ejercicios;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        int num;
        System.out.println("introduzca  un numero: ");
        Scanner leer=new Scanner(System.in);
        num=leer.nextInt();
        int []todasTablas=tablasNum(num);

    }

    public static int []tablasNum (int N){
        int[]tablas=new int[100];
        for (int j=1;j<=N;j++){
            System.out.println("la tabla del "+j+" es:");
            for(int i=1;i<=10;i++){
            tablas[i]=i*j;
            System.out.println(j+"*"+i+"="+tablas[i]);
        }
    }
        
        return tablas;
        
    }
}

