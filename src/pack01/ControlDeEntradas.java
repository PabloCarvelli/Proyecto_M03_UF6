package pack01;

import java.util.Scanner;

public class ControlDeEntradas {

    public static int entradaoEnteroPositivo(){
        int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextInt();
        }while(n < 0);
        return n;
    }

    public static float entradaFlotantePositivo(){
        float n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextFloat();
        }while(n < 0);
        return n;
    }

    public static String entradaString(){
        String s;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            s = entradaUsuario.nextLine();
        }while(s.length() <= 0);
        return s;
    }
}
