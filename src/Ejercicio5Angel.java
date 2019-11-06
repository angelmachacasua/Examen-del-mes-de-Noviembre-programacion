
import java.util.Scanner;

public class Ejercicio5Angel {
    public static void main(String[] ARMS) {
        Scanner leer=new Scanner(System.in);
        boolean salir=false; int opcion;
        while (!salir){
        System.out.println("Cual de todos los ejercicios quisiera probar :) ");
        System.out.println("---Ejercicio Nº1 OPCION: | 1 |");
        System.out.println("---Ejercicio Nº2 OPCION: | 2 |");
        System.out.println("---Ejercicio Nº3 OPCION: | 3 |");
        System.out.println("---Ejercicio Nº4 OPCION: | 4 |");
        System.out.println("...Salir de esta opcion : | 5 |");
        opcion=leer.nextByte();
        switch(opcion){
            case 1:
                Ejercicio1Angel EX1=new Ejercicio1Angel();
                EX1.main(ARMS);
                break;
            case 2:
                Ejercicio2Angel EX2=new Ejercicio2Angel();
                EX2.main(ARMS);
                break;
            case 3:
               Ejercicio3Angel EX3=new Ejercicio3Angel();
                EX3.main(ARMS);
                break;
            case 4:
                Ejercicio4Angel EX4=new Ejercicio4Angel();
                EX4.main(ARMS);
                break;
            case 5:
                salir=true;
                break;
            default:
                System.out.println("De la OPCION 1 a 5");
        }
        }
    }
    
}
