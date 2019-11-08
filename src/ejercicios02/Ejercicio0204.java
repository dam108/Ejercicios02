package ejercicios02;
import java.util.Scanner;
public class Ejercicio0204 {
    public static void main(String[] args) {
        // leer tres numeros enteros
        int var1 , var2, var3, resultado;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un valor: " );
        var1 = teclado.nextInt();
        System.out.println("Introduce un valor: " );
        var2 = teclado.nextInt();
        System.out.println("Introduce un valor: " );
        var3 = teclado.nextInt();
        // si son todos negativos mostrar el producto e los tres
        if (var1 < 0 && var2 < 0 && var3 < 0 ) { // en este punto son todos negativos
            resultado = var1 * var2 * var3;
            System.out.println("pruducto de los tres: "+ resultado); 
        } else { 
            if ( (var1 < 0 || var2 < 0 || var3 < 0) && (var1 > 0 || var2 > 0 || var3 > 0) ){ // a este punto alguno es negativo
                resultado = var1 + var2 + var3;
                System.out.println("suma de los tres es " +resultado);
            } 
            else { // todos los numeros son positivos
                    resultado = ( var1 + var2 ) * var3;
                    System.out.println("Sumar el primero y el segundo y multiplicar por el tercero: "+resultado);
            }
        }
        /* hay alguno negativo y alguno positivo => (a<0 || b<0 || c<0) && (a>0 || b>0 || c>0) */
        
        // NO EXISTE OTRA COMBINACIÓN 
    }
}