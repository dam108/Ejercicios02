package ejercicios02;
import java.util.Scanner;
public class Ejercicio0210 {
    public static void main(String[] args) {
        // leer la hora y el dia
        int dia, hora;
        boolean bus = false;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia en número de 1 a 7: ");
        dia = teclado.nextInt();
        System.out.println("Introduce la hora de 9 a 14: ");
        hora = teclado.nextInt();
        
        /* OPCION CON SWITCH ( SI ESTO NO VALE YO NO SE COMO SE HACE )*/
        
        if ( dia >= 1 && dia <=7 && hora >= 9 && hora <=14 ){
            switch (dia){
                case 1:  if (hora == 10 || hora == 14){bus = true;}; break;
                case 2:  if (hora == 10 || hora == 14){bus = true;}; break;
                case 3:  if (hora == 10 || hora == 13 || hora == 14 ){bus = true;}; break;
                case 4:  if (hora == 10 || hora == 12 || hora == 14 ){bus = true;}; break;
                case 5:  if (hora == 10 || hora == 14 ){bus = true;}; break;
                case 6:  if ( hora == 10 ){bus = true;}; break;
                case 7: bus = true; break;
            }
            if (bus == true){
                System.out.println("Si hay bus esta dia a esta hora");
            }
            else {
                System.out.println("No hay buses disponibles en las horas solicitadas");
            }
        }
        else{
            System.out.println("El dia y la hora introducida son incorrectos. ");
        }
        
        /* OPCION SIN SWITCH */
/* 
        // leer la hora y el dia
        int dia, hora;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia en número de 1 a 7: ");
        dia = teclado.nextInt();
        System.out.println("Introduce la hora de 9 a 14: ");
        hora = teclado.nextInt();
        // comprobar que los datos son correctos
        if ( dia >= 1 && dia <=7 && hora >= 9 && hora <=14 ){
            // comprobar si hay bus es e dia y esa hora
            if ( dia == 7 || hora == 10 ){ // si es domingo o son las 10
                System.out.println("Si hay bus.");
            }
            else {
                if ( hora == 12 && dia == 4 ){ // si es jueves a las 12
                    System.out.println("Si hay bus.");

                }
                else {
                    if ( hora == 13 && dia == 3){ // si es miercoles a las 13
                        System.out.println("Si hay bus.");
                    }
                    else{
                        if (hora == 14 && dia != 6 ){ // si es cualquier hora que no sea Sabado a las 14
                            System.out.println("Si hay bus.");
                        }
                        else { // resto de horas en las cuales no hay bus
                            System.out.println("No hay bus.");
                        }
                    }
                }
            }
        }
        else{
            System.out.println("El dia y la hora introducida son incorrectos. ");
        }
*/ 

    }
}