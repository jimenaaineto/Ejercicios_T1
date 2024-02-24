
/*La primera parte es ya corregida con copilot pq no m salia. 
Lo que eran los fallos estan comentados en el de arriba para que se vea */
package ejercicios;
import java.util.Scanner;

public class Ejercicio_8 {
        public static void main(String[] args) {
            int num;
            System.out.println("introduzca la longitud de array que desee: ");
            Scanner leernum=new Scanner(System.in);
            num=leernum.nextInt();
            int[]mostrarLista=pedirNumeros(num);
            int []minimoYmaximo=minYmax(mostrarLista);
            double calculoMedia=calcularmedia(mostrarLista);// ha cambiado a double pq la media no tiene pq ser un numero entero y no puedo hacer el cambio en el main de double a int
        }
    
        public static int []pedirNumeros(int num){
            int []lista=new int[num];
            int N;
            int cont=1;
            do{
            System.out.println("introduzca un numero: ");
            Scanner leer=new Scanner(System.in);
            N=leer.nextInt();
            if(N==0){//para que si introduzco el 0 deje de pedir numeros
                break;
            }
            lista[cont]=N;
            cont++;
            
            }while(cont<num);//para que no sobrepase la longitud del array
            
            return lista;
        }
    
       
        public static int[]minYmax(int[]pedirNumeros){//habia hech un array bidimensional y no era necesario, aparte de que lo habia hecho mal
            int min=pedirNumeros[0];//lo habia inicializado a 0 y todos iban a ser mayor a cero siempre
            int max=pedirNumeros[0];//lo habia inicializado a 0 y si llego a solo introducr numeros neg siempre hubiese sido el max
            int[]maximoyminimo=new int[2];
            for(int i=0;i<pedirNumeros.length;i++){
                if(pedirNumeros[i]<min){
                    min=pedirNumeros[i];
                    maximoyminimo[0]=min;
                }else if(pedirNumeros[i]>max){
                    max=pedirNumeros[i];
                    maximoyminimo[1]=max;            
                }else
            continue;
            
        }System.out.println("min: "+maximoyminimo[0]+" y max: "+maximoyminimo[1]);
        return maximoyminimo;
        
        }
    
        public static double calcularmedia (int[]pedirNumeros){
            int sum=0;//solo habia calculado la suma de los numeros 
            for(int i=0;i<pedirNumeros.length;i++){
                sum+=pedirNumeros[i];
                
            } double media=(double)sum/pedirNumeros.length;//es double pq puede tenrr decimales
            
            System.out.println("la media es: "+media);
            return media;//me ponia error y era pq tenia la funcion como int y estaba pidiedo que me devolviese un double
    
        }
    
    }
    

/* 
public class Ejercicio_8 {
    public static void main(String[] args) {
        int num;
        System.out.println("introduzca la longitud de array que desee: ");
        Scanner leernum=new Scanner(System.in);
        num=leernum.nextInt();
        int[]mostrarLista=pedirNumeros(num);
        int [][]minimoYmaximo=minYmax(mostrarLista);
        int calculoMedia=calcularmedia(mostrarLista);
    }

    public static int []pedirNumeros(int num){
        int []lista=new int[num];
        int N;
        int cont=1;
        do{
        System.out.println("introduzca un numero: ");
        Scanner leer=new Scanner(System.in);
        N=leer.nextInt();
        }while(N!=0);
        lista[cont]=N;
        cont++;
        return lista;
    }

   
    public static int[][]minYmax(int[]pedirNumeros){
        int min=0;
        int max=0;
        int[][]maximoyminimo=new int[100][100];
        for(int i=0;i<=pedirNumeros.length;i++){
            if(pedirNumeros[i]<min){
                min=pedirNumeros[i];
                maximoyminimo[0][1]=min;
            }else if(pedirNumeros[i]>max){
                max=pedirNumeros[i];
                maximoyminimo[1][0]=max;
        }else
        continue;
        
    }System.out.println(maximoyminimo[1][1]);
    return maximoyminimo;
    
    }

    public static int calcularmedia (int[]pedirNumeros){
        int media=0;
        for(int i=0;i<=pedirNumeros.length;i++){
            media+=pedirNumeros[i];
        }
        return media;

    }

}*/