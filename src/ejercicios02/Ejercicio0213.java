package ejercicios02;
import java.util.Scanner;
public class Ejercicio0213 {
    public static void main(String[] args) {
        
        /* VERSION MEJORADA, AL FINAL LO HICE TOSCO IGUAL  */ 
        int dia, mes, year, diasMes;
        boolean bisiesto = false;
        boolean wrongDate = false;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        year = teclado.nextInt();       
        
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
        }
        /* CODIGO CORREGIDO POR EL PROFESOR */
        if (mes == 12 && dia == diasMes){
            dia = 1;
            mes = 1;
            year++;
        }
        else {
            if (dia == diasMes){
                dia = 1;
                mes++;
            }
            else {
                dia++;
            }
        }
        System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
        
        
        
        /* CODIGO EXECIVO */
        /*
        if (mes == 12 && dia == diasMes){
            dia = 1 ;
            mes = 1 ;
            year++ ;
        }
        else {
            if (
                (diasMes == 31 && dia == diasMes) || ( diasMes == 30 && dia == diasMes ) || ( diasMes == 29 && bisiesto == true && dia == diasMes ) || ( diasMes == 28 && bisiesto != true && dia == diasMes )){
                dia = 1;
                mes++ ;
            }
            else {
                if ( diasMes == 28 && bisiesto != true && dia > diasMes ){ // añadi esto por que al 29/2/2001 le sumaba un dia 
                    System.out.println("la fecha es incorrecta");
                    wrongDate = true; // añado esto para que luego de imprimir fecha incorrecta tambien diga fecha no valida en vez de mostrar la fecha del dia siguiente 
                }
                else {
                    dia++;
                }
                
            }
        }
        if (wrongDate){
            System.out.println("Introduce una fecha valida."); // añado esto para que luego de imprimir fecha incorrecta tambien diga fecha no valida en vez de mostrar la fecha del dia siguiente 
        }
        else {
            System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
        }
        */
        
         /* PRIMERA VERSION FUNCIONA PERO ES MUY TOSCA */
/*       

        // leer un dia 
        int dia, mes , year;
        boolean bisiesto = false, mes30 = false, mes31 = false;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        year = teclado.nextInt();
      
        // CALCULAR EL DIA SIGUIENTE
        
        if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ){ // comprobamos si el mes tiene 30 dias 
            mes30 = true;
        }
        else {
            if ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){ // comprobamos si el mes tiene 31 dias
                mes31 = true;
            }
            else {
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){ // comprobamos si el año es bisiesto
                bisiesto = true;  // le damos valor verdadero a año bisiesto
                }
            }
        }
        if ( mes30 == true && dia >= 1 && dia <= 29){ // meses de 30 dias entre el 1 y el 29 se suma un dia
            dia += 1;
            System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
        }
        else {
            if ( mes30 == true && dia == 30){ // meses de 30 dias siendo el ultimo dia del mes , se le suma uno al mes y el dia se establece en 1
                dia = 1;
                mes += 1;
                System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
            }
            else{
                if (mes31 == true && dia >= 1 && dia <= 30){ // meses de 31 dias entre el 1 y el 30 se suma un dia
                    dia += 1;
                    System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                }
                else {
                    if ( mes31 == true && dia == 31 && mes == 12){ // último dia del año se establece dia 1 , mes 1 y se suma 1 al año
                        dia = 1;
                        mes = 1;
                        year += 1;
                        System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                    }
                    else {
                        if ( mes31 == true && dia == 31){ // meses de 31 dias siendo el ultimo dia del mes , se le suma uno al mes y el dia se establece en 1
                            dia = 1;
                            mes += 1;
                            System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                        }
                        else {
                            if ( mes == 2 && dia >= 1 && dia <= 27 ){ // si es febrero y no es bisiesto y el dia es entre 1 y 27 se suma un dia
                                dia += 1;
                                System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                            }
                            else {
                                if ( mes == 2 && bisiesto == true && dia == 28 ){ // si es febrero y es bisiesto y el dia es 28 suma un dia
                                    dia += 1;
                                    System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                                }
                                else {
                                    if (mes == 2 && bisiesto != true && dia == 28 ){ // si es febrero y no es bisiesto cambia de mes
                                        dia = 1;
                                        mes += 1;
                                        System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                                    }
                                    else {
                                        if ( mes == 2 && bisiesto == true && dia == 29){ // Si es bisiesto y es febrero y el dia es 29 cambia de mes
                                        dia = 1;
                                        mes += 1;
                                        System.out.println("la fecha del dia siguiente es: " + dia + "/" +mes+ "/" +year);
                                        }
                                        else {
                                            System.out.println("Has introducido alguna fecha mal");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
*/ 
    }
}