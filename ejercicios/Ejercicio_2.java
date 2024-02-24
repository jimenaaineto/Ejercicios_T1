/*Escribir un programa que muestre por consola los mayores
números enteros que se pueden representar mediante un char, short e int. */
package ejercicios;

public class Ejercicio_2 {
    public static void main(String[] args) {
        char maxChar = Character.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("El mayor número entero representable en un char es: " + (int) maxChar);
        System.out.println("El mayor número entero representable en un short es: " + maxShort);
        System.out.println("El mayor número entero representable en un int es: " + maxInt);
    }
    
}
    
