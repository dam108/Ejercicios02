package ejercicios02;
import java.util.Scanner;
public class Ejercicio0214 {
    public static void main(String[] args) {
        // leer dos fechas
        int dia1, mes1, year1, dia2, mes2, year2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia de la primera fecha");
        dia1 = teclado.nextInt();
        System.out.println("Introduce el mes de la primera fecha");
        mes1 = teclado.nextInt();
        System.out.println("Introduce el año de la primera fecha");
        year1 = teclado.nextInt();
        System.out.println("Introduce el dia de la segunda fecha");
        dia2 = teclado.nextInt();
        System.out.println("Introduce el mes de la segunda fecha");
        mes2 = teclado.nextInt();
        System.out.println("Introduce el año de la segunda fecha");
        year2 = teclado.nextInt();
                
        // calcular cual de las dos fechas es mayor
        
        // si year1 > year2 o  ( year1=year2 y mes1 > mes2 )o ( year1 = year2 y mes 1 = mes 2 y dia1 > dia2 ) 
        if ( year1 > year2 || ( year1 == year2 && mes1 > mes2 ) || ( year1 == year2 && mes1 == mes2 && dia1 > dia2 )){
            System.out.println("La fecha " + dia1 + "/" + mes1 + "/" + year1 + " es mayor que la fecha " + dia2 + "/" + mes2 + "/" + year2 );
        }
        else {
            if ( year1 == year2 && mes1 == mes2 && dia1 == dia2 ){ // comprobamos si las fechas son iguales
                System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + year2 + " es igual que " + dia1 + "/" + mes1 + "/" + year1 );
            }
            else { // si lo anterior no es , la segunda fecha es la mayor
                System.out.println("La fecha " + dia2 + "/" + mes2 + "/" + year2 + " es mayor que la fecha " + dia1 + "/" + mes1 + "/" + year1 );
            }
        }        
    }
    
}