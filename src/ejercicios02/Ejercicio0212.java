package ejercicios02;
import java.util.Scanner;
public class Ejercicio0212 {
    public static void main(String[] args) {
        // leer dia , mes y año
        int dia, mes, year, diasMes;
        boolean bisiesto = false;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        year = teclado.nextInt();
        
        /* VERSION MEJORADA */

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            diasMes = 31;
        }
        else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
                diasMes = 30;
            }
            else{
                if (mes == 2 && ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )){
                    bisiesto = true;
                    diasMes = 29;
                }
                else {
                    diasMes = 28;
                }
            }
        } // a esta alltura ya sabemos cuantos dias tiene el mes
        /* VERSION MEJORADA POR EL PROFESOR*/ 
        if (dia >= 1 && dia <= diasMes && mes >=1 && mes <= 12){ // aqui preguntamos si el dia esta entre 1 y el maximo para su mes y si el mes esta entre 1 y 12 meses
            System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
        }
        else {
           System.out.println("los valores de la fecha son incorrectos"); 
        }
        
        
        /* FUNCIONA PERO EL PROFESOR ME DICE QUE SOBRA MUCHO CODIGO
        if ( diasMes == 31 && (dia >= 1 && dia <= diasMes)){
            System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
        }
        else {
            if ( diasMes == 30 && (dia >= 1 && dia <= diasMes)){
                System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
            }
            else{
                if ( mes == 2 && bisiesto == true && (dia >= 1 && dia <= diasMes)){
                    System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
                }
                else {
                    if ( mes == 2 && bisiesto != true && (dia >= 1 && dia <= diasMes)){
                        System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
                    }
                    else {
                        System.out.println("los valores de la fecha son incorrectos");
                    }
                }
            }
        }*/
        // feberro 28 dias; 1 enero, 3 marzo, 5 mayo, 7 julio , 8 agosto, 10 octubre, 12 diciembre 31 dias; 4 abril 6 junio 9 septiembre, 11 noviembre 30 dias
        // comprobar si año es bisiesto y añadir a febrero 28 dias 
        // todos los años son validos         
        
/* PRIMERA OPCION FUNCIONA PERO ES PEOR */
/*      
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){ // comprobamos si el año es bisiesto
            bisiesto = true;  // le damos valor verdadero a año bisiesto
        }
        
        
        if ( bisiesto == true && mes == 2 && dia >= 1 && dia <= 29 ){ // comprobamos si es bisiesto y febreo tiene entre 1 y 29 dias 
            System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
        }
        else {
            if ( bisiesto == false && mes == 2 && dia >= 1 && dia <= 28 ){ // Si no es bisiesto y es febrero que compruebe que tiene 28 dias 
                System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
            }
            else {
                if (( mes == 1 ||mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && ( dia >=1 && dia <= 31 ) ){ // si no es bisiesto y es mes que tiene 31 dias que lo compruebe
                    System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
                }
                else {
                    if (( mes == 4 ||mes == 6 || mes == 9 || mes == 11 ) && ( dia >=1 && dia <= 31 ) ){ // si no es bisiesto y es mes que tiene 30 dias que lo compruebe
                        System.out.println("los valores son correctos, la fecha es " +dia+ "/" +mes+ "/" +year);
                    }
                    else {
                        System.out.println("los valores son incorectos!");
                    }
                }
            }
        }
*/
    }    
}