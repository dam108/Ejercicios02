package ejercicios02;
import java.util.Scanner;
public class Ejercicio0202 {
    public static void main(String[] args) {
        // leer m y n 
        int m, n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        m = teclado.nextInt();
        System.out.println("Introduce otro número: ");
        n = teclado.nextInt();
        
        if (m!=0){
            // determinar si m es divisor de n
            if (n % m == 0){
                System.out.println("El primer número es dividor del segundo");
            }
            else {
                System.out.println("El primer número no es dividor del segundo");
            }
            // determinar si m es mayor que n
            if ( m > n ) {
                System.out.println("El primer número es mayor que el segundo");
            }
            else {
                System.out.println("El primer número es menor que el segundo");
            } 
            
        } 
        else {
            System.out.println("el número no puede ser cero.");
        }

        //debe funcionar utilizando m = 0
    
    }
    
}