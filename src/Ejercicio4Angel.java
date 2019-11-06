
import java.util.Scanner;

public class Ejercicio4Angel {
    public static void main(String[] ARMS) {
        int[] vector={1,10,9,8,11,7,6,12,2,3,4,5};
        int i=0; boolean marca=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el mes : ");
        System.out.print("1= ENERO "); 
        System.out.print("2= FEBRERO ");
        System.out.print("3= MARZO ");
        System.out.print("4= ABRIL ");
        System.out.print("5= MAYO ");
        System.out.println("6= JUNIO ");
        System.out.print("7= JULIO ");
        System.out.print("8= AGOSTO ");
        System.out.print("9= SEPTIEMBRE ");
        System.out.print("10= OCTUBRE ");
        System.out.print("11= NOVIEMBRE ");
        System.out.println("12= DICIEMBRE");
        int mes=leer.nextByte();
        while (i<vector.length && marca==false) {            
            if(vector[i]==mes){
            marca=true;
            }
            i++;
        }
        if(marca==false){
            System.out.println("Mes no ENCONTRADO");
        }else{
            System.out.println("El mes Fue Encontrado en la posicion: "+(i));
        }
    }
    
}
