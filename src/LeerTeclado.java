import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
    public int leer(int dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }    
    public String leer(String dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=br.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }    
    public double leer(double dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public char leer(char dato, String mensaje){
        System.out.println(mensaje);
        try {
            char tmp = (char) new InputStreamReader(System.in).read ();
        } catch (IOException e) {
            System.out.println(mensaje);
        }
    return dato;
       }
    public boolean leer(boolean dato,String mensaje){
        try {
            boolean b=true;
            Boolean miBoolean=b;
        } catch (Exception e) {
            System.out.println(mensaje);
        }
    return dato;
    }

}

