package ejercicios;

import java.util.Scanner;
/*Escribe un programa que acepte una cadena de caracteres (que
podrá contener cualquier carácter a excepción del retorno de carro) y que la
escriba al revés. Reutiliza la función del ejercicio para la entrada de teclado y
otra función que invierta la cadena */
public class Ejercicio_13 {

    public static void main(String[] args) {
        String palabraLectura=lectura();
        String nuevaPalabra=invertirCadena(palabraLectura);
        System.out.println(nuevaPalabra);
        
    }
    public static String lectura(){

        String palabra;
        System.out.println("introduzca una palabra");
        Scanner leerCadena=new Scanner(System.in);
        palabra=leerCadena.nextLine();
        return palabra;
    }

    public static String invertirCadena(String palabraInvertir){
        String palabraInvertida="";
        for(int i=palabraInvertir.length()-1;i>=0;i--){
            //me fallaba pq no habia puesto el -1 despues de length
            palabraInvertida=palabraInvertida+palabraInvertir.charAt(i);
        }
        return palabraInvertida;
    }

}
