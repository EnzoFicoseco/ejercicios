
import java.util.Scanner;

/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser
de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca
el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class ejercicio7 {

    public static void main(String[] args) {

        String frase;
        int contC = 0;
        int contI = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese la frase");
            frase = leer.nextLine();
            if (frase.equals("&&&&&")) {
                break;
            }
            if ((frase.length() == 5) && (frase.substring(0, 1).equals("X")) && (frase.substring(frase.length() - 1).equals("O"))) {
                contC++;
            } else {
                contI++;
            }
        } while (true);

        System.out.println("La cantidad de lecturas correctas es de: "+ contC + " y la cantidad de lecturas incorrectas es de: "+ contI);
    }

}
