package ejercicios;

import java.util.Scanner;
/*Escribe un programa que acepte una cadena de caracteres (que
podrá contener cualquier carácter a excepción del retorno de carro) y que
diga cuántas vocales contiene. Realice la entrada de teclado en una
función (lectura de una string) y el cálculo de vocales de una string en
otra función independiente que reciba una string y devuelva un entero.  */
public class Ejercicio_12 {
    public static void main(String[] args) {
        String palabraLectura=lectura();
        int calculo=calculoVocales(palabraLectura);
        System.out.println("tiene: "+calculo+" vocales");
        
    }
    public static String lectura(){

        String palabra;
        System.out.println("introduzca una palabra");
        Scanner leerCadena=new Scanner(System.in);
        palabra=leerCadena.nextLine();
        return palabra;
    }

    public static int calculoVocales(String vocales){
        int cont=0;
        for (int i=0; i<vocales.length();i++){
            //lo que estaba teniendo mal es que no recorria la palbra entera. por eso se pone el charAT
        switch (vocales.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            cont++;
            break;
            default:
            break;
    }
}
    
    return cont;
}
}
