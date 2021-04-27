package pack01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlDeEntradas {

    public static int entradaoEnteroPositivo(){
        int n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextInt();
        }while(n < 0);
        entradaUsuario.close();
        return n;
    }

    public static float entradaFlotantePositivo(){
        float n;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            n = entradaUsuario.nextFloat();
        }while(n < 0);
        entradaUsuario.close();
        return n;
    }

    public static String entradaString(){
        String s;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            s = entradaUsuario.nextLine();
        }while(s.length() <= 0);
        entradaUsuario.close();
        return s;
    }

    public static boolean entradaBoolean(){
        boolean b = false;
        boolean b2;
        Scanner entradaUsuario = new Scanner(System.in);
        do{
            System.out.println("Escriba true para SI.");
            System.out.println("Escriba false para NO.");
            try{
                b = entradaUsuario.nextBoolean();
                b2 = true;
            }catch(InputMismatchException e){
                System.out.println("Esntrada invalida!");
                b2 = false;
            }

        }while(!b2);
        entradaUsuario.close();
        return b;
    }
}
