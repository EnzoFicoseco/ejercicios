
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class ejercicio6 {

    public static void main(String[] args) {

        int num1, num2, opc;
        String conf;
        boolean salio = false;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("|MENU|");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-SALIR");
            System.out.println("Elija una opción a continuación");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Seguro que desea salir? S/N");
                    conf = leer.next();
                    if (conf.equalsIgnoreCase("s")) {
                        System.out.println("Usted salió del programa. Hasta luego!");
                        salio = true;
                          
                    } else {
                        salio = false;
                        break;}
                    

            }
        } while (salio == false);
    }

}
