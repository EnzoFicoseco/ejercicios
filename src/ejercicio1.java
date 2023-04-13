
import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar.
 */
public class ejercicio1 {
public static void main(String[] args) {
       
  int num;
  Scanner leer = new Scanner (System.in);
    System.out.println("ingrese un numero entero");
    num = leer.nextInt();
    
    if (num%2 == 0) {
      System.out.println("el numero ingresado es par");  
    }
    else {
        System.out.println("el numero ingresado es impar");
    }
    }
    
}
