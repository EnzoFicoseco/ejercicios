
import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Substring
y equals() de Java.
 */
public class ejercicio4 {
    public static void main(String[] args) {
      String frase, inicial;
      Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una frase o palabra");
        frase = leer.nextLine();
       
        inicial = frase.substring(0,1);
        
     if (inicial.equalsIgnoreCase("a")){
        System.out.println("CORRECTO"); 
     }
     else {
         System.out.println("INCORRECTO");
     }
    }
    
}
