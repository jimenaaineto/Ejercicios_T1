package ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        String palabraLectura=lectura();
        boolean esPalindroma=palindroma(palabraLectura);
    }

    public static String lectura(){

        String palabra;
        System.out.println("introduzca una palabra");
        Scanner leerCadena=new Scanner(System.in);
        palabra=leerCadena.nextLine();
        return palabra;
    }

    public static boolean palindroma (String cadena){
        String invertida="";
        boolean booleancadena;
        for(int i=cadena.length()-1;i>=0;i--){
           
            invertida=invertida+cadena.charAt(i);
        }
        if (cadena.equals(invertida)){
            //yo estaba poniendo cadena==invertida, pero copilot me ha indicado que para comparar cadenas es mejor la funcion equals
            booleancadena = true;
            System.out.println("es palindroma");
        }else{
            booleancadena =false;
            System.out.println("no es palindroma");
        }
        return booleancadena;
    }
    
}
