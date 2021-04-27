package pack01;

import java.util.Scanner;

public class ControlDeEntradas {

    public static int pedirNumeroEnteroPositivo(){
        int n = -1;
        Scanner entradaUsuario = new Scanner(System.in);
        while(n < 0){
            n = entradaUsuario.nextInt();
        }

    }
}
