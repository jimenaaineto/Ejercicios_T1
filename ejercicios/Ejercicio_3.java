package ejercicios;

public class Ejercicio_3 {
    public static void main(String[] args) {

        int begin=1;
        int end=100;
        int contador=20;
        
        int []mostrarMultiplos=multiplosDe5(begin, end);
        int []mostarListaMultiplos=multiplosMostrar(mostrarMultiplos, contador);
        int sumaMultiplos=multiplosSumar(mostrarMultiplos);
        
        }
    
 
        public static int[]multiplosDe5(int begin, int end ){
            int []multiplos=new int[100];
            int cont=0;
            for (int i=begin;i<=end;i++){
                if(i%5==0){
                    multiplos[cont]=i;
                    cont++;
                }
                
            }System.out.println("hay " +cont+ " multiplos de 5 entre el 1 y el 100");
            return multiplos;
        }

        public static int[]multiplosMostrar(int[]multiplosDe5, int contador){
            int []multiplosM=new int[contador];
            for (int i=0;i<contador;i++){
                if(i!=0){
                    System.out.println(+multiplosDe5[i]);
                }
            }
            return multiplosM;
        }

        public static int multiplosSumar(int[]multiplosDe5){
            int suma=0;
            for(int i=0;i<multiplosDe5.length;i++){
                suma=suma+multiplosDe5[i];
            }
            System.out.println("la suma de dichos multiplos es: "+suma);
            return suma;
        }
    }
        