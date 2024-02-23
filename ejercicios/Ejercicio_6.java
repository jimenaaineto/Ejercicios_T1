package ejercicios;
/*Escribe un programa que muestre por pantalla la lista de los N
primeros números primos. Realiza una función que reciba N, devuelve un
array conteniendo los N primeros números primos y posteriormente
imprima el array en el main */
import java.util.Scanner;;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int N;
        System.out.println("introduzca un numero: ");
        Scanner leer=new Scanner(System.in);
        N=leer.nextInt();
        int []listaPrimos=numerosPrimos(N);

    }

    public static int []numerosPrimos(int N){
        int[]lista=new int [N];
        int cont=0;
        System.out.println("la lista de numeros primos de los "+N+" primeros numeros es:\n1\n2\n3");
        for(int i=4;i<=N;i++){
            if (i==5||i==7||i==11||i==13){
                System.out.println(i);
            } else if (i%2==0||i%3==0){
                continue;
            } else if (i%5==0||i%7==0) {
                continue;

            }else {
                System.out.println(i);
                lista[cont]=i;
                cont++;
            }
        }
        return lista;
    }
}
