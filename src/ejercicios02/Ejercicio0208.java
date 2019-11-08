package ejercicios02;
import java.util.Scanner;
public class Ejercicio0208 {
    public static void main(String[] args) {
        // leer los dos coeficientes
        double a, b, c, d, e, f, x , y;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a: ");
        a = teclado.nextInt();
        System.out.println("Introduce el valor de b: ");
        b = teclado.nextInt();
        System.out.println("Introduce el valor de c: ");
        c = teclado.nextInt();
        System.out.println("Introduce el valor de d: ");
        d = teclado.nextInt();
        System.out.println("Introduce el valor de e: ");
        e = teclado.nextInt();
        System.out.println("Introduce el valor de f: ");
        f = teclado.nextInt();
        
        /* 
            ax + by = c
            dx + ey = f
        */
            //comprobamos que el denominador no es cero por que si no el programa no va.
        if ( (a*e - b*d) != 0 ){
            x = (c*e - b*f)/(a*e - b*d);
            y = (a*f - c*d)/(a*e - b*d);
            System.out.println("Valor de x es: " +x);
            System.out.println("Valor de y es: " +y);
        }
        else {
            System.out.println("no se puede hace la operacion por que el denominador es cero");
        }
    }
    
}