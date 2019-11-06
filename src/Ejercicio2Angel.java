public class Ejercicio2Angel {
    public static void main(String[] ARMS) {
        String op = null;
        int a=0,b=0;
        LeerTeclado lt=new LeerTeclado();
        System.out.println("Operaciones aritmeticas:");System.out.println("Cual desea usar:");
        System.out.println(" + La suma");
        System.out.println(" - La resta");
        System.out.println(" * La multiplicacion");
        System.out.println(" / La division ");
        op=lt.leer(op, "Elija cual desea utilizar");
        switch(op){
            case "+":
                a=lt.leer(a, "Ingrese primer Digito");
                b=lt.leer(b, "Ingrese segundo Digito");
                System.out.println("La suma: "+(a+b));
                break;
            case "-":
                a=lt.leer(a, "Ingrese primer Digito");
                b=lt.leer(b, "Ingrese segundo Digito");
                System.out.println("La resta: "+(a-b));
                break;
            case "*":
                a=lt.leer(a, "Ingrese primer Digito");
                b=lt.leer(b, "Ingrese segundo Digito");
                System.out.println("La multiplicacion: "+(a*b));
                break;
            case "/":
                a=lt.leer(a, "Ingrese primer Digito");
                b=lt.leer(b, "Ingrese segundo Digito");
                System.out.println("La division: "+(a/b));
                break;
           default:System.out.println("Opcion no valida");
        }
    }
    
}
