import java.util.Arrays;
package ejercicios;
public class Ejercicio_3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);
        System.out.println("Múltiplos de 5: " + Arrays.toString(multiplosDe5));
        
        int suma = sumarValores(multiplosDe5);
        System.out.println("Suma de los múltiplos de 5: " + suma);
        
        System.out.println("Cantidad de múltiplos de 5: " + multiplosDe5.length);
    }
    
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidadMultiplos = (end - begin) / 5 + 1;
        int[] multiplosDe5 = new int[cantidadMultiplos];
        
        for (int i = 0; i < cantidadMultiplos; i++) {
            multiplosDe5[i] = begin + i * 5;
        }
        
        return multiplosDe5;
    }
    
    public static int sumarValores(int[] array) {
        int suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        
        return suma;
    }
}

