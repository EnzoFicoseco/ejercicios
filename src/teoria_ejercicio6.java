/*
 Ejercicio 6
Implementar un programa que le pida dos nÃºmeros enteros al usuario y 
determine si ambos o alguno de ellos es mayor a 25.
 */
import java.util.Scanner;

public class teoria_ejercicio6 {

    public static void main(String[] args) {
      int num1, num2;
     Scanner num = new Scanner (System.in);
     System.out.println("ingrese dos numeros enteros");
     num1 = num.nextInt();
     num2 = num.nextInt();
     
     if (num1>25 ||  num2>25){
        System.out.println("ambos o alguno de los numeros ingresados es mayor a 25");
    }
    }
    
}
