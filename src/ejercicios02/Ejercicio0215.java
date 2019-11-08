package ejercicios02;
import java.util.Scanner;
public class Ejercicio0215 {
    public static void main(String[] args) {
        //leer una nota de examen
        int nota;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la nota del examen ( 0 ~ 10 ): ");
        nota = teclado.nextInt();
        /* VERSION MEJORADA */
        if ( nota >=0 && nota <=10 ){
            switch(nota){
                case 0:
                case 1: 
                case 2: System.out.println("muy deficiente"); break;
                case 3:
                case 4: System.out.println("insuficiente"); break;
                case 5:
                case 6: System.out.println("aprobado"); break;
                case 7:
                case 8: System.out.println("notable"); break;
                case 9:
                case 10: System.out.println("Sobresaliente"); break;
            }
        }
        else {
            System.out.println("Nota no valida.");
        }
 
        /* PRIMERA VERSION */        
/*        
        // comprobar si es entre 0 y 10
        
        if ( nota >=0 && nota <=10 ){
            if ( nota >=0 && nota <= 2 ){
                System.out.println("Muy deficiente ");
            }
            else {         // mostrar por pantalla equivalencia en texto 
                if ( nota >=3 && nota <= 4 ){
                    System.out.println("Insuficiente ");
                }
                else {
                    if ( nota >=5 && nota <= 6 ){
                        System.out.println("Aprobado ");
                    }
                    else{
                        if ( nota >= 7 && nota <= 8 ){
                            System.out.println("Notable ");
                        }
                        else {
                            System.out.println("Sobresaliente ");
                        }
                    }
                }
            }
        }
        else {
            System.out.println("No has introducido una nota valida. ");
        }
*/
        
        // muy deficiente (0,1,2)
        // insuficiente (3,4)
        // Aprobado (5,6)
        // Notable (7,8)
        // Sobresaliente (9,10)
    
    }
    
}