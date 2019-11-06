
import java.util.Scanner;

public class Ejercicio3Angel {
    public static void main(String[] ARMS) {
        Scanner leer=new Scanner(System.in);
        int[] vector={42,57,14,40,96,19,8,68,1,4};
        int temp; String orden,DES = null;
        System.out.println("Ordenacion en Descendente o Ascendente");
        System.out.println("Ascendente= ASC");
        System.out.println("Descendente= DES");
        orden=leer.nextLine();
        if (orden.equals("DES")){
            for (int i = 1; i <vector.length; i++) {//Forma descendente <
            for (int j = 0; j < vector.length-i; j++) {
                if(vector[j]<vector[j+1]){
                temp=vector[j];
                vector[j]=vector[j+1];
                vector [j+1]=temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+"|");
        }
        }else if  (orden.equals("ASC")){
           for (int i = 1; i <vector.length; i++) {//forma Ascendente
            for (int j = 0; j < vector.length-i; j++) {
                if(vector[j]>vector[j+1]){//>
                temp=vector[j];
                vector[j]=vector[j+1];
                vector [j+1]=temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+"|");
        }
        }
        
    }
    
}
