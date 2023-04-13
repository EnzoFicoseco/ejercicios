/*
Ejercicio 9
Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle
y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class teoria_ejercicio9 {

    public static void main(String[] args) {
            
int num, sum, cont;
sum = 0;
cont=0;
Scanner leer = new Scanner (System.in);
do {
    System.out.println("ingrese un numero");     
    num = leer.nextInt();
    cont=cont+1;
    
    if (num==0){
        System.out.println("se capturó el numero cero");
    break;}
    
    if (num>0) {
        
    sum = sum + num;
    }
}while (cont<20);
    System.out.println("la suma de los numeros ingresados es " + sum); 
    }
    
}
