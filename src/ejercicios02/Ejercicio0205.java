package ejercicios02;
import java.util.Scanner;
public class Ejercicio0205 {
    public static void main(String[] args) {
        
        double notaEx, notaTrab, notaPrac;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Cual es la nota del examen? ");
        notaEx = teclado.nextDouble(); // leer nota examen
        
        System.out.print("¿Cual es la nota del trabajo en clase? ");
        notaTrab = teclado.nextDouble(); // leer nota de trabajo en clase
        
        System.out.print("¿Cual es la nota del trabajo practico? ");
        notaPrac = teclado.nextDouble(); // leer nota de de un trabajo práctico

        if (notaEx >= 5 || (notaEx > 4 && notaEx < 5 && notaPrac >5 && notaTrab >5) || (notaEx >=4 && notaEx < 5 && (notaPrac > 8 || notaTrab > 8))){
            System.out.println("Este alumno esta aprobado.");
        }
        else {
            System.out.println("Este alumno esta suspenso.");
        }
    }
}
                
        /*
        Situaciónes para aprobar:
        
        Nota examen >= 5
        Nota a examen >=4 && < 5 + trabajo en clase > 5 y trabajo práctico > 5
        Nota a examen >=4 && < 5 y nota > 8 o en el trabajo práctico o en la valoración del trabajo en clase
        */
