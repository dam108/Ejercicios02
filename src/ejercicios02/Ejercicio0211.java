package ejercicios02;
import java.util.Scanner;
public class Ejercicio0211 {
    public static void main(String[] args) {
        // leer la hora y el dia
        int hora;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la hora de 0 a 23: ");
        hora = teclado.nextInt();
        
        /* OPCION CON SWITCH ( SI ESTO NO VALE YO NO SE COMO SE HACE )*/
        
        if ( hora >= 0 && hora < 24 ){
            switch (hora){
                case 9: 
                case 11: System.out.println ("a esta hora solo hay bus el domingo."); break;
                case 10: System.out.println ("a esta hora hay todos los dias de la semana."); break;
                case 12: System.out.println ("a esta hora solo hay bus el Jueves y el domingo."); break;
                case 13: System.out.println ("a esta hora solo hay bus el Miercoles y el domingo."); break;
                case 14: System.out.println ("a esta hora hay bus todos los dias menos el sabado."); break;
                default: System.out.println ("No hay bus a esta hora ningun dia de la semana."); 
            }          
        }
        else{
            System.out.println("La hora introducida es incorrecta. ");
        }
        
        /* OPCION SIN SWITCH */
    
/*        // leer la hora del dia
        int hora;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una hora del dia (0 - 23): ");
        hora = teclado.nextInt();
        
        // comprobar en la tabla si hay bus
        if ( hora >=0 && hora <= 23){ 
            if ( hora >=9 && hora <=14 ){
                if ( hora == 9 || hora == 11 ){ // hora 9 y 11
                    System.out.println("Solo tienes bus el domingo.");
                }
                else {
                    if (hora == 10 ){// hora 10
                    System.out.println("en esta hora hay bus todos los dias de la semana.");
                    }
                    else {
                        if ( hora == 12 ){ // hora 12
                            System.out.println("en esta hora hay bus el jueves y el domingo");
                        }
                        else {
                            if ( hora == 13 ){ // hora 13
                                System.out.println("en esta hora hay bus el miercoles y el domingo");
                            }
                            else {
                                if ( hora == 14 ){ // hora 14
                                    System.out.println("en esta hora tienes bus todos los dias menos el sabado");
                                }
                            }
                        }
                    }
                }   
            }
            else { // resto de las horas
                System.out.println("en este horario no hay bus ningun dia de la semana");
            }
         }
        else { // informar que la hora es incorrecta
            System.out.println("no has introducido una hora correcta");
        }
*/
    }
}