/*Escribir un programa que defina variables que representen el número de días de un año, 
el número de horas que tiene un día, el número de minutos que tiene una hora y el número de 
segundos que tiene un minuto. Emplear las variables que ocupen el mínimo espacio de memoria posible.
 A continuación, calcular el número de segundos que tiene un año y almacenar el valor del cálculo 
 en otra variable. Realizar preferiblemente mediante una función que reciba como parámetros el 
 número de años, meses y días y devuelva el número de segundos de los días, */

 public class Ejercicio1{
    public static void main(String[]args){
      
         int year, day, hour, minutes;
         int secondsFinal=seconds(1, 1, 60);
         System.out.println("the total seconds are: "+secondsFinal);

     }

     public static int seconds(int secondYear, int secondDay, int secondHour){
         int seconds2=60;
         int minutes2=60;
         int hour2=24;
         int secondInHour=minutes2*seconds2*secondHour;
         int secondInDay=secondDay*hour2*minutes2*seconds2;
         int secondInYear=365*secondYear*hour2*minutes2*seconds2;
         int totalSeconds=secondInDay+secondInYear+secondInHour;
         return totalSeconds;
     }
 }