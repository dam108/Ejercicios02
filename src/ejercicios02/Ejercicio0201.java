package ejercicios02;
import java.util.Scanner;
public class Ejercicio0201 {
    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce un numero entero:");
        numero = teclado.nextInt();
        
        // con la sentencia if comprobamos si el número es par y si lo es
        // nos los indica
        if (numero % 2 == 0) {
            System.out.println ("Tu número es par");
        // si no es par , nos indica que es impar
        } 
        else {
            System.out.println ("Tu número es inpar");
        }
    }
    
}
