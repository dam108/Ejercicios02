package ejercicios02;
import java.util.Scanner;
public class Ejercicio0209 {
    public static void main(String[] args) {
        // leer un año
        // comprobar si es bisiesto o no 
        // año bisiesto es multiplo de 4 que no sean multiplos de 100 pero los multiplos de 400 tambien son bisiestos
        int year;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce un año: ");
        year = teclado.nextInt();
        // si año es multiplo de 4 y año no es multiplo de 100 o año es multiplo de 400 entonces si es bisiesto
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println("El año " +year+ " SI es bisiesto.");
        }
        else {
            System.out.println("El año " +year+ " NO es bisiesto."); 
        }
    }
}
