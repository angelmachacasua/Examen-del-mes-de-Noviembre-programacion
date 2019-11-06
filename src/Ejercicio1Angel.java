
import java.util.Scanner;

public class Ejercicio1Angel {
     public static void main(String[] ARMS) {
        int NumerodeAuto,Valor_de_auto,clave,suma=0,impuesto=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su numero de automovil: ");
        NumerodeAuto=leer.nextByte();
        System.out.println("Ingrese el valor de su automovil: ");
        Valor_de_auto=leer.nextByte();
        for (int i = 0; i < NumerodeAuto; i++) {
            System.out.println("Ingrese la clave de su automovil: ");
            clave=leer.nextByte();
            if (clave==1){
            impuesto=(int) (Valor_de_auto*0.1);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }else if(clave==2){
                impuesto=(int) (Valor_de_auto*0.07);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }else if (clave==3){
                impuesto=(int) (Valor_de_auto*0.05);
                System.out.println("El impuesto es: "+impuesto);
                suma=suma+impuesto;
            }
            System.out.println("El total a pagar es: "+suma);
        }
    }
}
    

