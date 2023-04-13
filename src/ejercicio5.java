/*
 Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los 
nú meros introducidos supere el lí mite inicial.
 */
import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int num, vl;
        int suma = 0;

        System.out.println("Ingrese el valor limite");
        vl = leer.nextInt();
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma <= vl);
        System.out.println("El limite inicial es " + vl + " y la suma fue " + suma);
    }
}