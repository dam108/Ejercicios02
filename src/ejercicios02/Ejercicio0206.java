package ejercicios02;
import java.util.Scanner;
public class Ejercicio0206 {
    public static void main(String[] args) {
        int horas, minutos, segundos, resultadoSegundos;
        
        // leer horas, minutos y segundos de un reloj digital
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la hora: ");
        horas = teclado.nextInt();
        System.out.println("Introduce los minutos: ");
        minutos = teclado.nextInt();
        System.out.println("Introduce los segundos: ");
        segundos = teclado.nextInt();
        
        // verificar que los valores sean correctos 
        
        if ( horas >= 0 && horas < 24 && minutos >=0 && minutos < 60 && segundos >= 0 && segundos < 60 ){ 
            resultadoSegundos = horas * 3600;  // calcular el número de segundos desde el comienzo del dia hasta la hora introducida
            resultadoSegundos += minutos * 60;
            resultadoSegundos += segundos;
            System.out.println("Han pasado " +resultadoSegundos+ " Segundos desde que empezo el día.");
        }
        else {
            System.out.println("No has introducido bien algun dato.");
        }
        // no emplear la clase fecha de java
    }
}