package ejercicios02;
import java.util.Scanner;
public class Ejercicio0207 {
    public static void main(String[] args) {
        // leer 3 datos y ordenarlos de mayor a menor
        int var1, var2, var3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el valor de la variable 1: ");
        var1 = teclado.nextInt();
        System.out.println("Introduce el valor de la variable 2: ");
        var2 = teclado.nextInt();
        System.out.println("Introduce el valor de la variable 3: ");
        var3 = teclado.nextInt();
        
        /* VERSION UN POCO MAS CORTA Y MENOS CONFUSA */
        
        if (var1 >= var2 && var2 >= var3){ 
            System.out.println( var1+ " >= " +var2+ " >= " +var3 );
        }
        else {
            if ( var1 >= var3 && var3 >= var2 ){
                System.out.println( var1+ " >= " +var3+ " >= " +var2 );
            }
            else{
                if ( var2 >= var1 && var1 >= var3 ){
                    System.out.println( var2+ " >= " +var1+ " >= " +var3 );
                }
                else {
                    if ( var2 >= var3 && var3 >= var1 ){
                        System.out.println( var2+ " >= " +var3+ " >= " +var1 );
                    } 
                    else {
                        if ( var3 >= var1 && var1 >= var2){
                            System.out.println( var3+ " >= " +var1+ " >= " +var2 );
                        }
                        else {
                            System.out.println( var3+ " >= " +var2+ " >= " +var1 );
                        }
                    }
                }
            }
        }
    }
}
/*
1 2 3
1 3 2
2 1 3
2 3 1
3 1 2
3 2 1
*/
