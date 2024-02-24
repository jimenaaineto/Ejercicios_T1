/*hecho con copilot pq se hacer todo menos mostrarlas en pantalla y que salgan bien. 
tampoco sabia muktiplicarlas  */
package ejercicios;
import java.util.Scanner;
/*Escribir un programa que multiplique dos matrices. Sus
dimensiones y valores deben de solicitarse al usuario por teclado y tras
realizar la multiplicación debe visualizarse en pantalla ambas matrices y el
Algoritmos y Estructuras de Datos Página 36 de 36
resultado de la multiplicación. Cree una nueva función similar al ejercicio
9 pero que recibirá vectores de varias dimensiones. Realice otra función
multiplicar matrices que reciba dos arrays de dos dimensiones que
representan 2 vectores y devuelva otro array de dos dimensiones que
contenga su multiplicación. En caso de no ser compatibles las dimensiones
la función indicará que ha habido un error. */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de las matrices al usuario
        System.out.print("Ingrese el número de filas de la primera matriz: ");
        int rows1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz: ");
        int cols1 = scanner.nextInt();
        System.out.print("Ingrese el número de filas de la segunda matriz: ");
        int rows2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int cols2 = scanner.nextInt();

        // Verificar si las dimensiones son compatibles para la multiplicación
        if (cols1 != rows2) {
            System.out.println("Error: Las dimensiones de las matrices no son compatibles para la multiplicación.");
            return;
        }

        // Crear las matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        // Solicitar los valores de las matrices al usuario
        System.out.println("Ingrese los valores de la primera matriz:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la segunda matriz:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiplicar las matrices
        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Mostrar las matrices y el resultado de la multiplicación
        System.out.println("Primera matriz:");
        printMatrix(matrix1);
        System.out.println("Segunda matriz:");
        printMatrix(matrix2);
        System.out.println("Resultado de la multiplicación:");
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

